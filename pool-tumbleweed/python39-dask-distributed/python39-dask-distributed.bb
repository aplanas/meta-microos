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

RPM_NAME = "python39-dask-distributed-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "6d99173d72726b754bd87a6ac31aa394a3a5f014f0e23f1cf01d599ae93985fda08fd694a2201894d547edf93c89e22c677d5276c3fa37853670d36eca474e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-distributed"

RDEPENDS:${PN} += "python39-dask \
python39-distributed"

inherit rpm
