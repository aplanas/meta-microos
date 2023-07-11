SUMMARY = "The Catalyst developer's manual"
DESCRIPTION = "The Catalyst developer's manual"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.9011"

RPM_NAME = "perl-Catalyst-Manual-5.9011-1.14.noarch.rpm"
RPM_HASH = "3f851256598c4ac20293bf49827bc1ce573f69745f3bbe4490d0ce1e73127527cc9aa5873f9eb2a36a7cfb8732f031db49158eb96549232d096afb7b7691fecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Catalyst--Manual \
perl-Catalyst-Manual"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
