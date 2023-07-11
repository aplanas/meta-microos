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

RPM_NAME = "python310-dask-complete-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "d7f5cf261967540de76388330d0afcc7e68443e2cc62a095303d05a2783989a2f8ff3989f239c8f02a8a96dab48098d085b34d60bc483b7472d2f4460c5f533e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-all \
python310-dask-complete"

RDEPENDS:${PN} += "python310-dask \
python310-dask-array \
python310-dask-dataframe \
python310-dask-diagnostics \
python310-dask-distributed \
python310-lz4 \
python310-pyarrow"

inherit rpm
