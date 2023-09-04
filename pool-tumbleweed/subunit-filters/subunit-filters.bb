SUMMARY = "Command line filters for processing subunit streams"
DESCRIPTION = "Command line filters for processing subunit streams."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-filters-1.4.2-3.2.noarch.rpm"
RPM_HASH = "90ec4c57ab99c5d06b14607e84e21500052843f2c1bd340472f1b5f3e7cef780389c8cb8722c0f73f2fb5aec69ae38180c13e1f58d8542f575b12b319edbbd9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subunit-filters"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-junitxml \
python3-python-subunit \
typelib-1-0-Gtk-3-0"

inherit rpm
