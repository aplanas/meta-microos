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

PV = "2023.3.2"

RPM_NAME = "python310-dask-diagnostics-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "b6fa9128028cd1fdcdf2ca57a2038221849467c2e76cfe4e7fdce502c7ed2f11ddaabd90db8e6daf4e5c92e0a37ba0e82d059ba43e06d2460a86aea216839437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-diagnostics \
python310-dask-diagnostics"

RDEPENDS:${PN} += "(python310-bokeh >= 2.4.2 with python310-bokeh < 3) \
python(abi) \
python310-Jinja2 \
python310-dask"

inherit rpm
