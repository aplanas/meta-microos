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

RPM_NAME = "python310-dask-diagnostics-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "3d0113fb185293c5ee0fba832474a0f203e211105285d0afe65676474b8fc19fa42305e1037e2e8344a7296bde9272f3a129bcd2502afa14645105b00fc1271f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-bokeh \
python310-dask"

inherit rpm
