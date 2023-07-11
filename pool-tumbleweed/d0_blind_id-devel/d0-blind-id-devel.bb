SUMMARY = "Development files for the Blind-ID library"
DESCRIPTION = "Development files for the Blind-ID library for user identification using \
RSA blind signatures"
LICENSE = "BSD-3-Clause"

PV = "0.8.6"

RPM_NAME = "d0_blind_id-devel-0.8.6-1.1.aarch64.rpm"
RPM_HASH = "7bcf4ba8f983090f6761b85cef82106cc3da6689dbb80ac861ca762ea4c6e5bf38d87f5c86c764c2fbd487adeb850ef0dfa3326d9db4f8048cda05b7a85bf397"

RPROVIDES:${PN} += "d0-blind-id-devel \
pkgconfig-d0-blind-id \
pkgconfig-d0-rijndael"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libd0-blind-id0 \
libd0-rijndael0"

inherit rpm
