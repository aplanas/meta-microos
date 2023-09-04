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

RPM_NAME = "python39-dask-diagnostics-2023.5.1-2.5.noarch.rpm"
RPM_HASH = "f96edaa3185a418ddc35329f0b58aaff95eb9f7eebda758b5121c0265ebf9cd1e4d5b21bc5b9906d53e466897e79ef33b5e41da80abc9ac1d8a2c8673794aa59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-bokeh \
python39-dask"

inherit rpm
