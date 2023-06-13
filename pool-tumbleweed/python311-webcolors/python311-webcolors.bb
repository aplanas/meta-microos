SUMMARY = "Support for color names and value formats defined by the HTML"
DESCRIPTION = "Webcolors is a simple Python module for working with HTML/CSS \
color definitions. \
 \
Support is included for normalizing and converting between the \
following formats (RGB colorspace only; conversion to/from HSL can be \
handled by the ``colorsys`` module in the Python standard library): \
 \
* Specification-defined color names \
* Six-digit hexadecimal \
* Three-digit hexadecimal \
* Integer ``rgb()`` triplet \
* Percentage ``rgb()`` triplet \
 \
Implementations are also provided for the HTML5 color parsing and \
serialization algorithms. \
 \
Full documentation is `available online <http://webcolors.readthedocs.org/>`_."
LICENSE = "BSD-3-Clause"

PV = "1.13"

RPM_NAME = "python311-webcolors-1.13-1.1.noarch.rpm"
RPM_HASH = "a0db387ad581434ef7b0444f8a296e9e3863f3c8e334e6a3af14cf72e79e8a010166a83c5112435a46791694c5286501f758a8e77fe7242e51b8b9252fb8b6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(webcolors) \
python311-webcolors \
python3dist(webcolors)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
