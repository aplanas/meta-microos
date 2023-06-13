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

RPM_NAME = "python311-dask-diagnostics-2023.3.2-3.1.noarch.rpm"
RPM_HASH = "bdbc1a2f23e3dd8687ae7c451066a574a7ce129d47ac29d681e62033649c4363c8f2164fbfe053009a170fa742dcf627620816e39742db2aefe1321e4b2421b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-dask-diagnostics"

RDEPENDS:${PN} += "(python311-bokeh >= 2.4.2 with python311-bokeh < 3) \
python(abi) \
python311-Jinja2 \
python311-dask"

inherit rpm
