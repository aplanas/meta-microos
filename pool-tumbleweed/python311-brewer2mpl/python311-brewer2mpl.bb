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

RPM_NAME = "python311-brewer2mpl-1.4.1-3.4.noarch.rpm"
RPM_HASH = "c51d7ec089e8df847d71b0fa84058e16f81ead75fd98d1df5f9c4d86574942b012883ed19f1dbc799012b32ba56eb687af69d8e19cfc77a4b2743769a1867d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-brewer2mpl \
python3.11dist-brewer2mpl \
python311-brewer2mpl \
python3dist-brewer2mpl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
