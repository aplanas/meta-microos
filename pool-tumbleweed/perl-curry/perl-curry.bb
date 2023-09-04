SUMMARY = "Create automatic curried method call closures for any class or object"
DESCRIPTION = "Create automatic curried method call closures for any class or object"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000001"

RPM_NAME = "perl-curry-2.000001-1.9.noarch.rpm"
RPM_HASH = "27ae913fa6bf1fc1be96562339cd881828687eb57fa52d8c113ad5922d82d08b9b42eadfba4440cb89a31ea60c1a06b7f0e456f1e3a06ebfc634542258a33eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-curry \
perl-curry--weak"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
