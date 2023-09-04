SUMMARY = "Simple mock test library using RAII."
DESCRIPTION = "Test::Mock::Guard is mock test library using RAII. This module is able to \
change method behavior by each scope. See SYNOPSIS's sample code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-Test-Mock-Guard-0.10-1.17.noarch.rpm"
RPM_HASH = "c7cd625a4cf447a8f66e28ebc165c7a3bd77335153d0d55da40db46b3b826871df817ad13ad6f226d1f10aa592179a50eddb865e6d5768a6f07d87cc1ed49932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Mock--Guard \
perl-Test-Mock-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Load \
perl-Exporter"

inherit rpm
