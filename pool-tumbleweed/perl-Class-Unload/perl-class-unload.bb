SUMMARY = "Unload a class"
DESCRIPTION = "Unload a class"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Class-Unload-0.11-1.25.noarch.rpm"
RPM_HASH = "32802d9d21b62b50b98d4bcf78aae2922d847574da3ff8293f2e395cd6e0d4cfcbe576472d6a336540e3739404103c37dcca9a1a20406f37de7ef94320b7fd49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Unload \
perl-Class-Unload"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Inspector"

inherit rpm
