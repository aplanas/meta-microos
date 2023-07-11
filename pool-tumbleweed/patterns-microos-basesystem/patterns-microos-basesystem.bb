SUMMARY = "openSUSE MicroOS Base System (alias pattern for microos_base)"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-basesystem-5.0-72.1.aarch64.rpm"
RPM_HASH = "634cda4927f1c2709707ea8ff3910ef8d7fa95e1ac9ef9c6683d8101730517adf7494eaeeef8d04322bf472ec126a1a82f15f3d2c006ffb8c43d415594c19b8f"

RPROVIDES:${PN} += "pattern- \
pattern-icon- \
patterns-microos-basesystem"

RDEPENDS:${PN} += "pattern-"

inherit rpm
