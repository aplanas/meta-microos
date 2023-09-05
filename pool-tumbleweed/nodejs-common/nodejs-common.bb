SUMMARY = "Common files for the NodeJS ecosystem"
DESCRIPTION = "Common NodeJS files that allow recursive invocation of Node executable \
while retaining the same codestream version."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "nodejs-common-6.0-2.1.aarch64.rpm"
RPM_HASH = "31c299f0b3abb4575a0d68a70572a1e5db8531fd156cf6b79bfa768a9ec6ab27fb52347983a5629e2010e7a71c540c611c2395805cb9c9692d2f3d3afe1232da"

RPROVIDES:${PN} += "nodejs-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libalternatives.so.1 \
libc.so.6 \
nodejs"

inherit rpm
