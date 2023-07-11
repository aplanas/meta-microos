SUMMARY = "Diagnostics for dask"
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
This package contains the dask.diagnostics module"
LICENSE = "BSD-3-Clause"

PV = "2023.5.1"

RPM_NAME = "python39-dask-diagnostics-2023.5.1-2.3.noarch.rpm"
RPM_HASH = "f3a0d04788838388741b1a386b816d51b11c8329c5586e16ff4107050cd1413356c92404055968e8eb3c02bafb436731ce5fb3e1217b0e5fdf0d90c655d57bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-bokeh \
python39-dask"

inherit rpm
