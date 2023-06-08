SUMMARY = "Development files for the Blind-ID library"
DESCRIPTION = "Development files for the Blind-ID library for user identification using \
RSA blind signatures"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "d0_blind_id-devel-1.0-3.12.aarch64.rpm"
RPM_HASH = "28bc64d214d93f9aacf67203ffe343d61a64e09741d721b44279c2f1d6daf3b019d1bb7c8a2f34ce651624946d5cb247015ce9b9a703417ae7e6059fac30a551"

RPROVIDES:${PN} += "d0_blind_id-devel d0_blind_id-devel(aarch-64) pkgconfig(d0_blind_id) pkgconfig(d0_rijndael)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libd0_blind_id0 libd0_rijndael0"

inherit rpm
