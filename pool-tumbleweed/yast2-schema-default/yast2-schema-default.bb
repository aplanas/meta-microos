SUMMARY = "YaST2 - AutoYaST Schema (default variant)"
DESCRIPTION = "AutoYaST Syntax Schema (default variant)"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-schema-default-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "ed39c252f0574c72cd953178e350c2cffbc0799a9c021a34b229479fc40c9a9a8747e359c1b8aecc16befdc8cdbaf7d1eef19fa8de2e0a06b4121b88369871cd"

RPROVIDES:${PN} += "yast2-schema \
yast2-schema-default"

RDEPENDS:${PN} += ""

inherit rpm
