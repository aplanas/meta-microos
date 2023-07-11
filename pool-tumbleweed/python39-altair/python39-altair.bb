SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python39-altair-4.2.2-1.6.noarch.rpm"
RPM_HASH = "b78ea6cb0289b49e6d5817c664ae0895b737a2f1fae13c488b50dc96be9796287d065cf233f251f27c30ea4f5a5b95abb4c39fedcdeb8dd0ed7bb4b42efb3883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-altair \
python39-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-entrypoints \
python39-jsonschema \
python39-numpy \
python39-pandas \
python39-toolz \
python39-typing"

inherit rpm
