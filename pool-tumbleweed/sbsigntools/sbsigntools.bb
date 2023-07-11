SUMMARY = "Canonical EFI binary signing tools"
DESCRIPTION = "This package installs tools which can cryptographically sign EFI \
binaries and drivers."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "sbsigntools-0.9.5-1.2.aarch64.rpm"
RPM_HASH = "40efc5196099ccee52f77933d9db67604ebe8a93ecba223ebf65d05304cbd87e7a0172fe269161de41145eb3893388b42f56d949f83372a7d54cb083d942a715"

RPROVIDES:${PN} += "sbsigntools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1"

inherit rpm
