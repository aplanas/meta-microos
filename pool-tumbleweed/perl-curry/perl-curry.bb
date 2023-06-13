SUMMARY = "Create automatic curried method call closures for any class or object"
DESCRIPTION = "Create automatic curried method call closures for any class or object"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000001"

RPM_NAME = "perl-curry-2.000001-1.7.noarch.rpm"
RPM_HASH = "4f8099e764dc14732f9215e607bb4dbd35fc6ede43e27ce0815923572df36923d6e583874422fe091dc2adc2a57bcaf917dbe734dbfd7d15e690dea72e4d71d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(curry) \
perl(curry::weak) \
perl-curry"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
