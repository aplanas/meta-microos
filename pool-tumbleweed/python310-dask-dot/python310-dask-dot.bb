SUMMARY = "Display dask graphs using graphviz"
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
This package contains the graphviz dot rendering interface."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python310-dask-dot-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "122c9a8c0f58a887ae22a0086838939946ee749165aa01b3f4f7084b59c7eafd23edc4ce6dd0601281a842aacd16471becd77100d0c2a358d8598ad94f9f7148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-dot \
python310-dask-dot"

RDEPENDS:${PN} += "graphviz \
graphviz-gd \
graphviz-gnome \
python-abi \
python310-dask \
python310-graphviz"

inherit rpm
