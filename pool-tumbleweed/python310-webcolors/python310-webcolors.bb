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

RPM_NAME = "python310-webcolors-1.13-1.1.noarch.rpm"
RPM_HASH = "07668afb70a91ab90ac857d3e91a892e4f45e0fae2ee62d5cd0c7732df19af784c3d25af59d0f8ea4c495254dd4cac6d74d6ca0ffc4ebe5662616fa9efb48856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webcolors \
python3.10dist-webcolors \
python310-webcolors \
python3dist-webcolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
