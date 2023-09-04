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

RPM_NAME = "python310-dask-distributed-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "019ffc693441999f4f6116d1d036cdced12ad0b0bbdb94d4b66032b64f39c5c026c1b36156ec130b84a737aed4bd4f9704617bdd39654ff1003cb2e52b4f0762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-distributed"

RDEPENDS:${PN} += "python310-dask \
python310-distributed"

inherit rpm
