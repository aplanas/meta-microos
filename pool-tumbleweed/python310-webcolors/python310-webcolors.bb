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

RPM_NAME = "python310-webcolors-1.13-1.3.noarch.rpm"
RPM_HASH = "bbf097f188c2b5647432eb0f0631bab67208fe62dc9fb615435ba3dd1813cc097f4257db8b1892a07c362b2733f532708e30307269ef683146a7c410b2d8422a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-webcolors \
python310-webcolors \
python3dist-webcolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
