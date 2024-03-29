SUMMARY = "Minimal task scheduling abstraction"
DESCRIPTION = "A flexible library for parallel computing in Python. \
 \
Dask is composed of two parts: \
- Dynamic task scheduling optimized for computation. This is similar to \
  Airflow, Luigi, Celery, or Make, but optimized for interactive \
  computational workloads. \
- “Big Data” collections like parallel arrays, dataframes, and lists that \
  extend common interfaces like NumPy, Pandas, or Python iterators to \
  larger-than-memory or distributed environments. These parallel collections \
  run on top of dynamic task schedulers."
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python311-dask-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "02713c82c9539a40f4b9ae5343ce54eef1f6ffa329281378ad0164bc4adefaf2ee83e3f11f1550f8924790124771b132e21f55b0df60df1e44ad46f70277b3c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask \
python3-dask-bag \
python3-dask-delayed \
python3-dask-dot \
python3-dask-multiprocessing \
python3.11dist-dask \
python311-dask \
python311-dask-bag \
python311-dask-delayed \
python311-dask-dot \
python311-dask-multiprocessing \
python3dist-dask"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-click \
python311-cloudpickle \
python311-fsspec \
python311-importlib-metadata \
python311-packaging \
python311-partd \
python311-toolz \
update-alternatives"

inherit rpm
