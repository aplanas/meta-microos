SUMMARY = "Deepin Password Check tool"
DESCRIPTION = "deepin-pw-check is a tool to verify the validity of the password"
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "deepin-pw-check-5.1.16-1.4.aarch64.rpm"
RPM_HASH = "944fa18a175eccf546544e8fdb54e3863275da1811b57fa48d186b79d40162c7c052efd09286be50274c00347620ee4c5086b0686a08a71fd7a272611d34e5ed"

RPROVIDES:${PN} += "deepin-pw-check deepin-pw-check(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
