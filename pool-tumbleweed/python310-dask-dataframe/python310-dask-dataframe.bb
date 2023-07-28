SUMMARY = "Pandas-like DataFrame data structure for dask"
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
This package contains the dask DataFrame class. \
 \
A Dask DataFrame is a large parallel dataframe composed of many \
smaller Pandas dataframes, split along the index. These pandas \
dataframes may live on disk for larger-than-memory computing \
on a single machine, or on many different machines in a cluster."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python310-dask-dataframe-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "9306f78222610fc1c8f2ab8c5e336ee33e2418bb0e5cad4ff4b7a4e17f980adc6385aa96ad9b106d16abf7a6b3d8cfb38118f0f54a920936ca30d399ca74d4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-dataframe"

RDEPENDS:${PN} += "python-abi \
python310-dask \
python310-dask-array \
python310-dask-bag \
python310-numpy \
python310-pandas"

inherit rpm
