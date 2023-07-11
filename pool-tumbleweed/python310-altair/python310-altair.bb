SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python310-altair-4.2.2-1.6.noarch.rpm"
RPM_HASH = "ddeeab95acdab90cd6ad268f69d6ef74b6440f3158b92399951aaf2bb851b19e656a246151278cbe9d86f0e926bff6d148da09d0c2dc74e6f12224737114d442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-altair \
python310-altair \
python3dist-altair"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-entrypoints \
python310-jsonschema \
python310-numpy \
python310-pandas \
python310-toolz \
python310-typing"

inherit rpm
