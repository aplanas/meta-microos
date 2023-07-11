SUMMARY = "Common files for libax25"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators. \
 \
This package contains common config files for libax25."
LICENSE = "LGPL-2.1+"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-common-0.0.12~rc5-1.10.noarch.rpm"
RPM_HASH = "50bd98f254dc56737df18d1702c652d5f4f0b42c1cf4054e6ccea95ee5fcfab47a18c9596d1fcb2bdfab383af4244374eabc8cf6158915022f71eb640a82c9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libax25-common \
libax25-common"

RDEPENDS:${PN} += ""

inherit rpm
