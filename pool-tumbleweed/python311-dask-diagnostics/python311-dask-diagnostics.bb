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

RPM_NAME = "python311-dask-diagnostics-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "e17db07c43f5af294f599d205d095b9f3847088d09643ccabe262c599f0ea5763cbcd530bb13ebdd1a01b243463e33a946d141b475ae9c349a7ee39ea659dd84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-diagnostics \
python311-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-bokeh \
python311-dask"

inherit rpm
