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

RPM_NAME = "python311-dask-diagnostics-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "9aa43ae15ef0b46b029a8d678c5e057fb22b4de624833b4951e6993bb3a7d4e1c1bd21ca13ea29989380cc1cc6d84434feb8e86496795c3ccbf506b49bb4ca48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-diagnostics \
python311-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-bokeh \
python311-dask"

inherit rpm
