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

RPM_NAME = "python310-dask-dataframe-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "7471c1158239d2a8107555f659fa5238b81f58d4a92c8cdcba1807e8eb8a78a76073d04a5362d616134b9878558a0955228d96ffb4461f6edff3cd29c3b244f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-dataframe"

RDEPENDS:${PN} += "python-abi \
python310-dask \
python310-dask-array \
python310-dask-bag \
python310-numpy \
python310-pandas"

inherit rpm
