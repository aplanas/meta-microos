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

RPM_NAME = "python39-dask-complete-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "003869b597ca1140d1dbf0faa1ba220e377ebb187a986fb1c60b50ad049836f3f4a276ce4d671b751417000655770a18309de273ef5881043471110d6f3c82da"
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
