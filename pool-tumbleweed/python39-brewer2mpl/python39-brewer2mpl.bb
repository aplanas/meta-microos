SUMMARY = "colorbrewer2org color maps for Python and matplotlib"
DESCRIPTION = "brewer2mpl is a pure Python package for accessing colorbrewer2.org \
color maps from Python. With brewer2mpl, the raw RGB colors of all 165 \
colorbrewer2.org color maps can be retrieved. The color map data ships with \
brewer2mpl, so that no network connection is required. \
 \
For more information and to view some of the color maps, see the wiki at \
https://github.com/jiffyclub/brewer2mpl/wiki."
LICENSE = "Apache-2.0 & MIT"

PV = "1.4.1"

RPM_NAME = "python39-brewer2mpl-1.4.1-3.4.noarch.rpm"
RPM_HASH = "7fc1d4ddf00080cf7ed0fdd43f19ead9006f05d44ee7475d3c846ea865bc562829c0ff3bcdffe12dc6f71e869c1a64613e77f25dab54ba07ae63a970da197a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-brewer2mpl \
python39-brewer2mpl \
python3dist-brewer2mpl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
