SUMMARY = "Client for containerd"
DESCRIPTION = "Standalone client for containerd, which allows management of containerd containers \
separately from Docker."
LICENSE = "Apache-2.0"

PV = "1.6.21"

RPM_NAME = "containerd-ctr-1.6.21-1.1.aarch64.rpm"
RPM_HASH = "29e882534810ef867065a3eac02c1c8252a2f9491f6febda368385182cedf2bd714518be7856ab8edb8e9485e14c4b103ccf84a21d5fa8cd0d5fb89df5011a5a"

RPROVIDES:${PN} += "containerd-ctr containerd-ctr(aarch-64)"
RDEPENDS:${PN} += "containerd libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
