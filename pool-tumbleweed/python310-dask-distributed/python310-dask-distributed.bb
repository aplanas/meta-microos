SUMMARY = "Interface with the distributed task scheduler in dask"
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
This meta package pulls in the distributed module into the dask namespace."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python310-dask-distributed-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "18357df878ff9d1893948f3c7522212252ae498394aec9dfb69050ef27c34eb6af3e0c82f2b8bf720b9cf74570d87ddaff83db7c964ca76361c7dbe2f2d7baeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-distributed"

RDEPENDS:${PN} += "python310-dask \
python310-distributed"

inherit rpm
