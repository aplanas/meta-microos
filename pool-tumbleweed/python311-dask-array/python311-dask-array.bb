SUMMARY = "Numpy-like array data structure for dask"
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
This package contains the dask array class. \
 \
Dask arrays implement a subset of the NumPy interface on large \
arrays using blocked algorithms and task scheduling."
LICENSE = "BSD-3-Clause"

PV = "2023.3.2"

RPM_NAME = "python311-dask-array-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "21aee98e9cc56be4a469f6babebd02e23000c5913cdf7ea474a9df94494679dc97582fa2bff60fde9bf069738af215a63563b4a90ee3d5c0d0452919687c7136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-dask-array"

RDEPENDS:${PN} += "python(abi) \
python311-dask \
python311-dask-delayed \
python311-numpy"

inherit rpm
