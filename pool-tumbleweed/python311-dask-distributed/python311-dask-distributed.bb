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

RPM_NAME = "python311-dask-distributed-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "3e04cb0c9dee58af7ca73fc03898fc26a07143fc6ea3d074aae626d095e39215a8acd7b3ab19543428277723a000e6337cd7eb04dcdb26e520a28cc407316602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-distributed \
python311-dask-distributed"

RDEPENDS:${PN} += "python311-dask \
python311-distributed"

inherit rpm
