SUMMARY = "openSUSE MicroOS defaults"
DESCRIPTION = "This provides default packages for openSUSE MicroOS which can be optionally \
replaced by alternatives."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-defaults-5.0-73.1.aarch64.rpm"
RPM_HASH = "535a5c6a9a62e7710c5b52c21242e593131c33b0c40bbc82ed5d6b71a18e773f5b896a528e4ac4144b196cabf4af33f4de6e64220180c981df6b70644a22a3e1"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-defaults"

RDEPENDS:${PN} += "audit \
pattern- \
systemd-coredump"

inherit rpm
