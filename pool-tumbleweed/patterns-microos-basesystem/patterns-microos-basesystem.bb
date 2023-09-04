SUMMARY = "openSUSE MicroOS Base System (alias pattern for microos_base)"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-basesystem-5.0-73.1.aarch64.rpm"
RPM_HASH = "e7b31eb6b184b93ee771d7cddda9c8f8212214cc72cc2c4bab4c98250979aad4ba5893c84958cd61d2352d0adf51114eb6134254b3fd64c32adb3c0031e713e7"

RPROVIDES:${PN} += "pattern- \
pattern-icon- \
patterns-microos-basesystem"

RDEPENDS:${PN} += "pattern-"

inherit rpm
