SUMMARY = "OpenBSD tool to sign and verify signatures on files (portable version)"
DESCRIPTION = "Signify - Sign and Verify. \
A portable version of the OpenBSD tool to sign and verify signatures on files. \
See http://www.tedunangst.com/flak/post/signify for more information."
LICENSE = "BSD-3-Clause"

PV = "31"

RPM_NAME = "signify-31-1.4.aarch64.rpm"
RPM_HASH = "e9aaee5c9306902f0d92e3c0cb060132c749a61b35ffb181ffa7a95c3f87c2fb1881a373cfcfaa6c6da1332b3ec49a01f0659c9ac9ffdb4e07fc5868f84e0ec3"

RPROVIDES:${PN} += "signify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6"

inherit rpm
