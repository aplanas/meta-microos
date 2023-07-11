SUMMARY = "Provide the stuff missing in Hash::Util"
DESCRIPTION = "Similar to List::MoreUtils, 'Hash::MoreUtils' contains trivial but \
commonly-used functionality for hashes. The primary focus for the moment is \
providing a common API - speeding up by XS is far away at the moment."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Hash-MoreUtils-0.06-1.17.noarch.rpm"
RPM_HASH = "aaff204ff5bea6955927cb6bfc8b60e151d1cdad171cb9c34d9d19bc2ba9ca0ad408c65483e0551e1bb8231fe311f143091cbd4b1301f3c0d880aa14fbd5a20e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--MoreUtils \
perl-Hash-MoreUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
