SUMMARY = "Provide the stuff missing in Hash::Util"
DESCRIPTION = "Similar to List::MoreUtils, 'Hash::MoreUtils' contains trivial but \
commonly-used functionality for hashes. The primary focus for the moment is \
providing a common API - speeding up by XS is far away at the moment."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Hash-MoreUtils-0.06-1.16.noarch.rpm"
RPM_HASH = "379ef93b04fed786f4f404ee54b3b4828082ebbecb57e89c1b5f060fa1b03440b2bb85cc05d2e99e7aac29dd837d5b54b97d3d756f9d9a17c59aa73ea5e1c004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Hash::MoreUtils) \
perl-Hash-MoreUtils"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
