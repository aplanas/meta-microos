SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python39-altair-4.2.2-1.4.noarch.rpm"
RPM_HASH = "6a813b2885f728d0bc046eca32c885ada222c275813ad530e51c1ea0107704cf743165375aae523931afe82e9b31898302da55fce84548372d71b647c592bd29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(altair) \
python39-altair \
python3dist(altair)"

RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-entrypoints \
python39-jsonschema \
python39-numpy \
python39-pandas \
python39-toolz \
python39-typing"

inherit rpm
