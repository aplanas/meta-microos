SUMMARY = "Toolkit for converting source code to build artifacts"
DESCRIPTION = "BuildKit is a toolkit for converting source code to build artifacts in an efficient, expressive and repeatable manner."
LICENSE = "Apache-2.0"

PV = "0.11.2"

RPM_NAME = "buildkit-0.11.2-1.3.aarch64.rpm"
RPM_HASH = "851330905f55e37e6b352b3abea5233e45dda58cc568a229f1a85a6f6b67788cb733d003e5fc69cb22c47a81ecb3b57f88749a4f9361a2610073578a8bc193ca"

RPROVIDES:${PN} += "buildkit buildkit(aarch-64)"
RDEPENDS:${PN} += "/bin/sh containerd libc.so.6(GLIBC_2.34)(64bit) runc"

inherit rpm
