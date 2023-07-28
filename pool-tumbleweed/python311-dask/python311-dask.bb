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

RPM_NAME = "python311-dask-2023.5.1-2.4.noarch.rpm"
RPM_HASH = "1ee590c1cf67053b2f10eff7459115249ba95f36c02c0452c5dbc888d96aa7c5d1a1fa962c7bbe5d2ccad72cf473649d97e995a53a0db86f74b325785dd924ae"
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
