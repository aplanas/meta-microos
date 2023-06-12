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

PV = "2023.3.2"

RPM_NAME = "python311-dask-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "c056d4cfc9d3e228e31ca97e152a1c9e3d2e9228e35dabeffb43da68c98967b4a960bfd4aeba5da8c58341b8e205897668d4cfdc71175d22857341ea5d368e6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dask) \
python311-dask \
python311-dask-multiprocessing \
python3dist(dask)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
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
