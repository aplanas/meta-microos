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

RPM_NAME = "python39-dask-dataframe-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "16351625260528837fa177dd83fcfba11d867d244708555a905165e193d62d33bc59df90a1d510c06101ee7822a3273c252a43ec6f92cacc45767e3a9141c960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-dataframe"

RDEPENDS:${PN} += "python-abi \
python39-dask \
python39-dask-array \
python39-dask-bag \
python39-numpy \
python39-pandas"

inherit rpm
