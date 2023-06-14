SUMMARY = "YaST2 - AutoYaST Schema (default variant)"
DESCRIPTION = "AutoYaST Syntax Schema (default variant)"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-schema-default-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "891f7bcc24ebe94a0243e71e2f4c1c572c9967c6782f1ab6e56448f0591a7933bae274ce557928e4ebfb26e7861d54d37301b62a374d957ec1e5a8654d1adb4d"

RPROVIDES:${PN} += "yast2-schema \
yast2-schema-default"

RDEPENDS:${PN} += ""

inherit rpm
