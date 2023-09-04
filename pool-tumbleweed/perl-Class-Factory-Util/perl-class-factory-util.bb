SUMMARY = "Provide utility methods for factory classes"
DESCRIPTION = "This module exports a method that is useful for factory classes."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.7"

RPM_NAME = "perl-Class-Factory-Util-1.7-14.26.noarch.rpm"
RPM_HASH = "ad96d83d1a1bb8fbdcd9d327bf4c2256bd45e82d1491e547b464c8ba66b5f94c0c32ff743dd2571ab3dd6470f551e199a678fa62108492f79373329fba242c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Factory--Util \
perl-Class-Factory-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
