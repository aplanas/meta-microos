SUMMARY = "Common files for libax25"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators. \
 \
This package contains common config files for libax25."
LICENSE = "LGPL-2.1+"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-common-0.0.12~rc5-1.9.noarch.rpm"
RPM_HASH = "7e303f30b6c1d4f2bc18a46ce33e7d0af87067806167a41ee1d60c6cf58062b02cc9bdfba9b8aeb0fe283c16f0eaf5bb57bab174f600cb4a3c1a2a405981f718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libax25-common) \
libax25-common"

RDEPENDS:${PN} += ""

inherit rpm
