SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python311-altair-4.2.2-1.6.noarch.rpm"
RPM_HASH = "a4a9351bf543019135d2e3f5b4da566d7410ba41dfbba7db104518088dd952938381572ffb009711043b2238c5662eff2cf28b501404607cfda9b121811c397b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-altair \
python3.11dist-altair \
python311-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-entrypoints \
python311-jsonschema \
python311-numpy \
python311-pandas \
python311-toolz \
python311-typing"

inherit rpm
