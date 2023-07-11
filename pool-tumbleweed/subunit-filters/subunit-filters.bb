SUMMARY = "Command line filters for processing subunit streams"
DESCRIPTION = "Command line filters for processing subunit streams."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-filters-1.4.2-2.4.noarch.rpm"
RPM_HASH = "516a6650895dd4a5e6c5b9051cbd82ec7f0852ba5171b2810a85c68033b188d5f7ab7fcdbc359862b98d5bbe29ad6f7ef8b049d534ac0c208a6daa3a6785757b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subunit-filters"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-junitxml \
python3-python-subunit \
typelib-1-0-Gtk-3-0"

inherit rpm
