SUMMARY = "BroadVoice 32 development files"
DESCRIPTION = "Header files for the libbv32 library."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice32-devel-1.2-2.7.aarch64.rpm"
RPM_HASH = "c0fff7f3320c6b0d3e45f6bf402f6757c06ffba18e3d65e551ac0155c54ba1aa130031f974b9bfabecf50668a14fb6e156d78e019c560736d9adf0afff2540a1"

RPROVIDES:${PN} += "broadvoice32-devel broadvoice32-devel(aarch-64)"
RDEPENDS:${PN} += "broadvoice32"

inherit rpm
