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

RPM_NAME = "python310-brewer2mpl-1.4.1-3.2.noarch.rpm"
RPM_HASH = "8ed4e4869f2b50c5c493a200773cd07ff51fa7f9cae9d1a82f8a9e705c762dd62cb2aa09468bd7ac91d1075ef8499f85432d0c0caac0206bedba96d916c1e885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-brewer2mpl \
python3.10dist(brewer2mpl) \
python310-brewer2mpl \
python3dist(brewer2mpl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
