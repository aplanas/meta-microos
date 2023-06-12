SUMMARY = "Utilities for accessing NFS servers"
DESCRIPTION = "The utils-libnfs package contains simple client programs for \
accessing NFS servers using libnfs."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "5.0.2"

RPM_NAME = "utils-libnfs-5.0.2-1.4.aarch64.rpm"
RPM_HASH = "fb50f499103d945cbc495b73a1958de3c2cb6d5315812b536ca3294978f9f707f7b74586288c2b7f6614bf88a1990b41bf3433b18799b209468e030547698af7"

RPROVIDES:${PN} += "libnfs \
utils-libnfs \
utils-libnfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnfs.so.14()(64bit)"

inherit rpm
