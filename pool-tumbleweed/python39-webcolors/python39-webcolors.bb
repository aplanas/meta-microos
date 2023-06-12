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

RPM_NAME = "python39-webcolors-1.13-1.1.noarch.rpm"
RPM_HASH = "69284079ba4334d3c95813e16498bcb981450d6a0c8877fec0219979613b7cfc1bb703f59db42533302e0c1bead1c3c6ad350b727a3fdb31c347ca1f89d23c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(webcolors) \
python39-webcolors \
python3dist(webcolors)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
