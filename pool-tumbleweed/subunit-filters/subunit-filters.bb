SUMMARY = "Command line filters for processing subunit streams"
DESCRIPTION = "Command line filters for processing subunit streams."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-filters-1.4.2-2.2.noarch.rpm"
RPM_HASH = "5f948aa6d9686dd5fda09f3ce1cb7af031c2c4455c2dcdf01e707542e1e9f4b39dc06301884ae5d4cc9bb6116f2666699f08ca684731c66c4e8cdc10dcb82849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subunit-filters"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python3-junitxml \
python3-python-subunit \
typelib-1-0-Gtk-3-0"

inherit rpm
