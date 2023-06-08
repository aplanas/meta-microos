SUMMARY = "CFEngine promises master files"
DESCRIPTION = "Masterfiles are the pristine version of the CFEngine promises. These \
will be available in /var/cfengine/masterfiles and are copied to \
/var/cfengine/inputs by CFEngine."
LICENSE = "LGPL-3.0-or-later & MIT"

PV = "3.21.0"

RPM_NAME = "cfengine-masterfiles-3.21.0-1.1.noarch.rpm"
RPM_HASH = "5c329850d86985f1a8341d39f18e4246148149fd76c44508212bd8375c4253dbf754adafe8370da8a7e197ec85b7abd734b681a5e09e72758d88034244e3a6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfengine-masterfiles"
RDEPENDS:${PN} += "cfengine"

inherit rpm
