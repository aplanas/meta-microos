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

RPM_NAME = "python39-webcolors-1.13-1.3.noarch.rpm"
RPM_HASH = "3b9c3863c45acfe72be153fcf8475e24dc6b30d127376963399e508f373ed03204db8ddcb9d05987768058fec422e1d3b7f36f891d7fab62c2a7afbe8593e068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-webcolors \
python39-webcolors \
python3dist-webcolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
