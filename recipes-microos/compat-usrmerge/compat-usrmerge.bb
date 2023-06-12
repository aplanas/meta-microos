SUMMARY = "UsrMerge related scripts"
DESCRIPTION = "Scripts and data files related to UsrMerge \
(https://en.opensuse.org/openSUSE:Usr_merge). Normally not needd."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-84.87-5.14.aarch64.rpm"
RPM_HASH = "1bc5fbe59b76435f12adf44d1dd8dad5e35834178554fbf8b049716a676f3d73c110fbcd5c1bb4156738d61c8a94e61c21d6b9665d577510af759ed80550ab5e"

RPROVIDES:${PN} += "compat-usrmerge \
compat-usrmerge(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
