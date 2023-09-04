SUMMARY = "Provide the stuff missing in Hash::Util"
DESCRIPTION = "Similar to List::MoreUtils, 'Hash::MoreUtils' contains trivial but \
commonly-used functionality for hashes. The primary focus for the moment is \
providing a common API - speeding up by XS is far away at the moment."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Hash-MoreUtils-0.06-1.18.noarch.rpm"
RPM_HASH = "bc447254b46e442ee2e83f3cea1b89c409b371fa103c006a6791c439f86358bcae0894b16975decdb20fadf2dbb8ef59e1069791f9a960a72b527cf301a91f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--MoreUtils \
perl-Hash-MoreUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
