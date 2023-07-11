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

RPM_NAME = "python311-dask-complete-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "ed1ed752e10437de5830ef44cf959f447fb9b6656ca591740cda29d00442b90353d81dbcb432dd8657f7d72d6dfda1b79e45f54faf072ecacb1d05bb07ecb285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-all \
python3-dask-complete \
python311-dask-all \
python311-dask-complete"

RDEPENDS:${PN} += "python311-dask \
python311-dask-array \
python311-dask-dataframe \
python311-dask-diagnostics \
python311-dask-distributed \
python311-lz4 \
python311-pyarrow"

inherit rpm
