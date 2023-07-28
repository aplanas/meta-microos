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

RPM_NAME = "python311-dask-diagnostics-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "3ad92f58d3d96dd18520d37a9f192901cccf9f3c2fe1d668747dfa0a756078dcc881f3bb4b93b36c3903fa17a23d36d3c231fee71ba290004044d780f9684445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-diagnostics \
python311-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-bokeh \
python311-dask"

inherit rpm
