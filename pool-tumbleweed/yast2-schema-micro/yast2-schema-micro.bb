SUMMARY = "YaST2 - AutoYaST Schema (micro variant)"
DESCRIPTION = "AutoYaST Syntax Schema (micro variant)"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-schema-micro-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "8b02bf59e023b4ad0e7843ca5206a04177eb7d6b9b63f6a3637778ec2a5983a3c82299dae8cd4c0583efff5065485af8de032f41964c4cec600fe7b7a2a3b500"

RPROVIDES:${PN} += "yast2-schema \
yast2-schema-micro \
yast2-schema-micro(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
