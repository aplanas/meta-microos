SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ca-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "b3f3172ec2102c1ceed207ab7dd2c66cd278a2185966d9ba88dffb0d33ebc75c5348a4a186eee2e31958f81394392783833e2b60ccf122316b830b1cdeb6493e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ca \
yast2-trans-ca"

RDEPENDS:${PN} += ""

inherit rpm
