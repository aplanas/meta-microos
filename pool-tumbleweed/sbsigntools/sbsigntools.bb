SUMMARY = "Canonical EFI binary signing tools"
DESCRIPTION = "This package installs tools which can cryptographically sign EFI \
binaries and drivers."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "sbsigntools-0.9.5-1.1.aarch64.rpm"
RPM_HASH = "afefdabbc07ebc24397f218de2306a41fea8006834e5300d8642f49794cd73924ec9cb7f40c0a2ff06c044d128d341baec2785c72b12164290f9d7e4584ff382"

RPROVIDES:${PN} += "sbsigntools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1"

inherit rpm
