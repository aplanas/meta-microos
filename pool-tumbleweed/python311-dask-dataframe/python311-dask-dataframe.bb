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

RPM_NAME = "python311-dask-dataframe-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "f694a3de879efbcfa3c619292ddf82a919e127a94199f9ecfc9b449baf2147fe0addbe9949371d2849ceb6c85dd76c117258fa79cc518835f6ec0759821425b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-dataframe \
python311-dask-dataframe"

RDEPENDS:${PN} += "python-abi \
python311-dask \
python311-dask-array \
python311-dask-bag \
python311-numpy \
python311-pandas"

inherit rpm
