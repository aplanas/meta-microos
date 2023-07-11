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

RPM_NAME = "python311-webcolors-1.13-1.3.noarch.rpm"
RPM_HASH = "3a1a67fcdccedd5ee6934fca55892fdbdbda065b51388aa0437a17038ea18534c2ae1fdeba094de49899a8a19f5045e378d135d785d92b8b35b3447bc1498b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webcolors \
python3.11dist-webcolors \
python311-webcolors \
python3dist-webcolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
