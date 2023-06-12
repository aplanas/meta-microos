SUMMARY = "openSUSE MicroOS Base System (alias pattern for microos_base)"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-basesystem-5.0-70.1.aarch64.rpm"
RPM_HASH = "6d7d307a522fb16afe73c3de0820130eda38248cb5a25226c3d2db0788051fae8515b3c13a07e0a8782cc4bc05c9c8296deb804e92e6902bd8b4c500cf89fb51"

RPROVIDES:${PN} += "pattern() \
pattern-icon() \
patterns-microos-basesystem \
patterns-microos-basesystem(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
