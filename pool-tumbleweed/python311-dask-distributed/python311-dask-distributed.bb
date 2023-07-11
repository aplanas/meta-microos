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

RPM_NAME = "python311-dask-distributed-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "b58c7108f8ec993343756833b8584439997286787cd4a53e310cdb7efd313f8ffc602c2e9af2abe7b72bed9cbf551b5cb801b98446a6fff380be6c85aea7851e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-distributed \
python311-dask-distributed"

RDEPENDS:${PN} += "python311-dask \
python311-distributed"

inherit rpm
