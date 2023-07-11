SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "a538ca179766c220e5871148752b737f8c88f781a9c6009bab425d9e32e09bea479cbfbef566b66ea82724cf67c3d6c181f2df019a477e4d16aa8d16d878fd4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"

RDEPENDS:${PN} += ""

inherit rpm
