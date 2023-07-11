SUMMARY = "All dask components"
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
This package pulls in all the optional dask components."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python39-dask-complete-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "67c349bf3df3aaf0571bdd5a0f9ce0036fbe574e876b3dd0725a693f3939df045783e1b48d2ce67145fde63b52de9e33ce9b0a08ea6caeee066811ff71f9985d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-all \
python39-dask-complete"

RDEPENDS:${PN} += "python39-dask \
python39-dask-array \
python39-dask-dataframe \
python39-dask-diagnostics \
python39-dask-distributed \
python39-lz4 \
python39-pyarrow"

inherit rpm
