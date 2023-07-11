SUMMARY = "XKB event daemon"
DESCRIPTION = "The xkbevd event daemon listens for specified XKB events and executes \
requested commands if they occur. The configuration file consists of \
a list of event specification/action pairs and/or variable definitions."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "xkbevd-1.1.5-1.3.aarch64.rpm"
RPM_HASH = "986c984ea2427f90840a2994cbed50d398309c7f3c2946e06dbd68b434da466104f13ff3e78fed498dd43302d90fb20b65116a06c20ead92628f9933bb3de62e"

RPROVIDES:${PN} += "xkbevd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
