SUMMARY = "UEFI secure boot toolkit"
DESCRIPTION = "The collection of tools for UEFI secure boot (userspace tools only)"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.9.2"

RPM_NAME = "efitools-1.9.2-1.7.aarch64.rpm"
RPM_HASH = "6503a299b35febd900add960be9c0935d36fc19687cc84e7148ddff3b64b15e4ee7b42a00f884ace9991fd8b9c3402e42ad5422937f8edb96dbd506a5138a791"

RPROVIDES:${PN} += "efitools \
efitools(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libcrypto.so.3()(64bit)"

inherit rpm
