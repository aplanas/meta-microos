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

RPM_NAME = "python39-brewer2mpl-1.4.1-3.2.noarch.rpm"
RPM_HASH = "41ae7e839de479527c53ad58c8ac437f765edc0efa74f237061f50f47ba1c49dac38478acb074d6317c2582d78938ea0189a18fcc042e60e3c6f2258f44ff2c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-brewer2mpl \
python39-brewer2mpl \
python3dist-brewer2mpl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
