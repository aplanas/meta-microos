SUMMARY = "Create automatic curried method call closures for any class or object"
DESCRIPTION = "Create automatic curried method call closures for any class or object"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000001"

RPM_NAME = "perl-curry-2.000001-1.8.noarch.rpm"
RPM_HASH = "cf9c17203cd9569e364b33ce89b6d44f16f3bf5ec2f68aa45d41b9d4d3aa6749cd153bf62574ebfa30b3712151b2fd9470ef5ee3c8182886e91fdc7856f2478a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-curry \
perl-curry--weak"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
