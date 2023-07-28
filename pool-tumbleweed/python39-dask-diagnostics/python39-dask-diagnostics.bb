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

RPM_NAME = "python39-dask-diagnostics-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "7701121f4d0f3b18692b7b8e187cd6f22e731489938dcea464a6379884c0c5254151eb71dda7fd957763306b46fca60fab8022eb031d3a43f733e62188357e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-bokeh \
python39-dask"

inherit rpm
