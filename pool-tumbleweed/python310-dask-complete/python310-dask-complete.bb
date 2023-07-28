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

RPM_NAME = "python310-dask-complete-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "d097a4934fec9d6d5efe84ab5e0e01058a955a3a3d6a3314b4d8790839a6df604c0c35b5515528415b528f8790747af570165c07d14dcc748e0e51c1d0f342ac"
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
