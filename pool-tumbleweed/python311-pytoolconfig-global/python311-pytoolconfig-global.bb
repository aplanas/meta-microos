SUMMARY = "[global] extra for python311-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [global] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python311-pytoolconfig-global-1.2.4-1.6.noarch.rpm"
RPM_HASH = "94246b32879622f98e33e6502ed1a2d1e3553fb43684b016c95f0870b9baede15f550c2a5b531e6531507957f7e208fc611a5736d1e23a63e4d6464d8f9bba79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig-global \
python311-pytoolconfig-global"

RDEPENDS:${PN} += "python311-platformdirs \
python311-pytoolconfig"

inherit rpm
