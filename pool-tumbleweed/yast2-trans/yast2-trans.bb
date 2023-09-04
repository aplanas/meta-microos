SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "dba9356eef138b5403225c9cbd15f20e6a89f770bbac7d2460ef9fa34a1e0f3ff422f02756cb6ff77a0913155c45459ac8fe2fc50c3cd1b829d5822ecfbf14e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"

RDEPENDS:${PN} += ""

inherit rpm
