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

RPM_NAME = "python310-dask-distributed-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "9449b7bd1ce83ce68da050c83467d58e1d60963044bc6ae416fb2c815f5e229d7c3d40235f85f4bbc0161d19bd4d3511531e0a0abbb4016a02f4363a980b0519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-distributed"

RDEPENDS:${PN} += "python310-dask \
python310-distributed"

inherit rpm
