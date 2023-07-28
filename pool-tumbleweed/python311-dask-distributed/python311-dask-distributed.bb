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

RPM_NAME = "python311-dask-distributed-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "b9c06d94690976b8ca4a653908615f79c775edad5bbc92a4a3a89c899bd596418fd8632ee5e60a2a37d20b72bcb3fadcf7e5cbdca41c1c1f7594bb00d4ef2a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-distributed \
python311-dask-distributed"

RDEPENDS:${PN} += "python311-dask \
python311-distributed"

inherit rpm
