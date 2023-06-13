SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python311-altair-4.2.2-1.4.noarch.rpm"
RPM_HASH = "80d2f35ba02ae76cc20625b7592a3ffe32f4262015ffdde27f0f57943ea1f416ee2af268f8d182d57d5248c9d4dab4f99400afbc4ae6091c11967ed4f8f42005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(altair) \
python311-altair \
python3dist(altair)"

RDEPENDS:${PN} += "python(abi) \
python311-Jinja2 \
python311-entrypoints \
python311-jsonschema \
python311-numpy \
python311-pandas \
python311-toolz \
python311-typing"

inherit rpm
