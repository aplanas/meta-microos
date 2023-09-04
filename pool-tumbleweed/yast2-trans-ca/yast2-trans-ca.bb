SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ca-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "c20a585f4065357313fcc759f45369ab6e9f7b841d0e9da819783295f3f991e1021907a1de4d20a124f0ef2d14cfb154bde6a238b0f15830391a6ca55d47279d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ca \
yast2-trans-ca"

RDEPENDS:${PN} += ""

inherit rpm
