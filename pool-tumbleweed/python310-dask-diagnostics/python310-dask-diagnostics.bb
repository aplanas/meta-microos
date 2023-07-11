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

RPM_NAME = "python310-dask-diagnostics-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "e248a1b799783373c23568995f5393dde5debb5eb8a899065c61cea059ff0b3343d5ac51dc20fc0ecfb884b138581bfac1d5e6cf8ff3378a54981e2e9b11e233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-bokeh \
python310-dask"

inherit rpm
