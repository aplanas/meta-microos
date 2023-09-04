SUMMARY = "Software Management"
DESCRIPTION = "This pattern provides a graphical application and a command line tool for keeping your system up to date."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-sw_management-20200505-42.1.aarch64.rpm"
RPM_HASH = "5fce24d62a13351835073d12c09e491005a27210da41ba838593954a65c8850507b886b89eb198cd49640bb73211b934213c793e95319175f5b5fe14f579a291"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-sw-management \
patterns-openSUSE-sw-management"

RDEPENDS:${PN} += "zypper"

inherit rpm
