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

RPM_NAME = "python39-dask-distributed-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "fcda9e3be4a8dc84f41cd433ce717e8703af0d4bb8dca73aab813a8a2e5859faa5843b0c2dca41c2bfdd521c95710a2ed7e09585bc6449cbbed80665137c77de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-distributed"

RDEPENDS:${PN} += "python39-dask \
python39-distributed"

inherit rpm
