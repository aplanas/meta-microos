SUMMARY = "Test JSON data"
DESCRIPTION = "JavaScript Object Notation (JSON) is a lightweight data interchange format. \
the Test::JSON manpage makes it easy to verify that you have built valid \
JSON and that it matches your expected output. \
 \
See the http://www.json.org/ manpage for more information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Test-JSON-0.11-1.25.noarch.rpm"
RPM_HASH = "3655525015a651a3490f2d4e0944f69a3e807d97c02da70bae6c8fcce5987afd0390c1582941457ed1ffd4889153cb3e84a08cfb0e3c1594a04fb3e2d2c06b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--JSON \
perl-Test-JSON"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-JSON--Any \
perl-Test--Differences \
perl-Test--Tester"

inherit rpm
