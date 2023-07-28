SUMMARY = "Diagnostics for dask"
DESCRIPTION = "A flexible library for parallel computing in Python. \
 \
Dask is composed of two parts: \
- Dynamic task scheduling optimized for computation. This is similar to \
  Airflow, Luigi, Celery, or Make, but optimized for interactive \
  computational workloads. \
- “Big Data” collections like parallel arrays, dataframes, and lists that \
  extend common interfaces like NumPy, Pandas, or Python iterators to \
  larger-than-memory or distributed environments. These parallel collections \
  run on top of dynamic task schedulers. \
 \
This package contains the dask.diagnostics module"
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python310-dask-diagnostics-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "a313dc7440a2b6167e02cee6a07af2c09403977af9d23ec318296176bafd61420fb7ec75fe875cdd9bcf2c2f041390be79acf439b1d13b4da75a10d11bed1e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-bokeh \
python310-dask"

inherit rpm
