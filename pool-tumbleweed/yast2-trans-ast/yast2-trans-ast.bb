SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ast-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "868deec56870aa687cf0e44cbe6f951331dfb7314056fe08a9eb34b52a23bc6eeda20ec97aabbc9ec2fa34719f45f811378e62771b89442df33316a948b2954f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ast \
yast2-trans-ast"

RDEPENDS:${PN} += ""

inherit rpm
