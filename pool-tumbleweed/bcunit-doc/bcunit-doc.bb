SUMMARY = "BCUnit documentation"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit documentation files."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.2+git.20191119"

RPM_NAME = "bcunit-doc-3.0.2+git.20191119-1.13.aarch64.rpm"
RPM_HASH = "bd49501dd75c88ee18e87436eb456824a30676ec70f932a0130a5be5d9f604b946ae718312ef8b8f0884346f44294f3bd5fc65afe89d05160cc4aabb64c4049c"

RPROVIDES:${PN} += "bcunit-doc"

RDEPENDS:${PN} += "libbcunit1"

inherit rpm
