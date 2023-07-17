SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-fa-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "5670158b2f2e1881f7356ff086c9fc24ea3d40462cfc2f81d1cb8c1020ca71df5924a8225c70cfdcc06c3cae8beec6a97b32c64a99cfa7387ecfbb9aaff6a74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fa \
yast2-trans-fa"

RDEPENDS:${PN} += ""

inherit rpm
