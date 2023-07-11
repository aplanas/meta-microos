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

RPM_NAME = "python310-brewer2mpl-1.4.1-3.4.noarch.rpm"
RPM_HASH = "0994ecd53211a53f4c27a7ba9ec258efa0b35a25dd6a89ca97d49a5d9f4919ddb00b7937d0aaa294b752cf664c9693db4ec13b9a425bfe5b470b8b024231afdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-brewer2mpl \
python310-brewer2mpl \
python3dist-brewer2mpl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
