SUMMARY = "Simple mock test library using RAII."
DESCRIPTION = "Test::Mock::Guard is mock test library using RAII. This module is able to \
change method behavior by each scope. See SYNOPSIS's sample code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-Test-Mock-Guard-0.10-1.16.noarch.rpm"
RPM_HASH = "e035d4f08e95b593f6ddf2c459b18fca46fdb08a3aa4643f87adf60af92e76c1dc4f5cafc3a989341862b5b72a8760492620dc20ae6f67e5f1a4cebec8b70e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--Guard \
perl-Test-Mock-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Load \
perl-Exporter"

inherit rpm
