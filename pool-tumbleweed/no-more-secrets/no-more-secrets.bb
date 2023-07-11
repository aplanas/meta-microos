SUMMARY = "A recreation of the 'decrypting text' effect from the 1992 movie Sneakers"
DESCRIPTION = "A tool to recreate the famous 'decrypting text' effect as seen in the 1992 movie Sneakers."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "no-more-secrets-1.0.1-1.8.aarch64.rpm"
RPM_HASH = "42b89efb2237e25a7d02380211c3d3ebda9d41db4e7363f748f1abbe37b1f36f833e4166a6b085625617a53a606736d2089a06ca59b9a636d0d6243b0f7992a5"

RPROVIDES:${PN} += "no-more-secrets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
