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

RPM_NAME = "python310-dask-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "6070f3a4fce547ad2bea0ad6cc297e11dfbe00fb68c16a462ef40dfdf652a694781d1c9952c1b8ead4bce60f72db7b6b0169dcaef5a75e5dcc40f4d61a4aa632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dask \
python310-dask \
python310-dask-bag \
python310-dask-delayed \
python310-dask-dot \
python310-dask-multiprocessing \
python3dist-dask"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-click \
python310-cloudpickle \
python310-fsspec \
python310-importlib-metadata \
python310-packaging \
python310-partd \
python310-toolz \
update-alternatives"

inherit rpm
