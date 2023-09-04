SUMMARY = "Test for valid YAML"
DESCRIPTION = "Test for valid YAML"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Test-YAML-Valid-0.04-10.23.noarch.rpm"
RPM_HASH = "5043bc96168ffd524837088f982cc602491e4c0e160b3a9a44fe88ad7545cabc8fd96389dcc3380049e2a8a9346969bd641aefb9619f99d8a02781aa7598f548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--YAML--Valid \
perl-Test-YAML-Valid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-YAML"

inherit rpm
