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

RPM_NAME = "python39-dask-distributed-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "a526b430bb8dc2028b74c190d3dfdf958b7dc640c6656bc37c6a431aaeafc06cb28b60cae2c782e077ec0ac9c7f9f07b1d08bac01d453b26859ad5d76e987a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-distributed"

RDEPENDS:${PN} += "python39-dask \
python39-distributed"

inherit rpm
