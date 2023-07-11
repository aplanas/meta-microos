SUMMARY = "YaST2 - AutoYaST Schema (micro variant)"
DESCRIPTION = "AutoYaST Syntax Schema (micro variant)"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-schema-micro-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "150bad04607b32a4709a8d630702b9a9085738ba70c7c8a03dd8cb92aa90feb9c1ffaa44f814c9c806196164708d7af924401a814e2036d478b0ac1ac89258f5"

RPROVIDES:${PN} += "yast2-schema \
yast2-schema-micro"

RDEPENDS:${PN} += ""

inherit rpm
