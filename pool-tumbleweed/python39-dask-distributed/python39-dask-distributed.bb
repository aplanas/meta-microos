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

PV = "2023.3.2"

RPM_NAME = "python39-dask-distributed-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "485ca7a90b067e749a78895d675298573748ebb0b42b5eb0fffd9590b2117927eaa4bd9d9e9639e5979ec674f9346716cde1289fb90dca971a52b20cb95ab1c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-distributed"

RDEPENDS:${PN} += "python39-dask \
python39-distributed"

inherit rpm
