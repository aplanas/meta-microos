SUMMARY = "Help and Support Documentation"
DESCRIPTION = "Help and Support Documentation"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-documentation-20200505-42.1.aarch64.rpm"
RPM_HASH = "ec2fce4170aaf4ddd95c62f9ec439cdb469f11cdab922d33b8bd4f20944ca2515f10cff11936e8dd407832c067009e512ffd2c71bea32acc8b734d9505c00bc5"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-documentation \
patterns-openSUSE-documentation"

RDEPENDS:${PN} += "man \
pattern-"

inherit rpm
