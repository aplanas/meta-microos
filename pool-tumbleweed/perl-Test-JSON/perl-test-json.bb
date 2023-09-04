SUMMARY = "Test JSON data"
DESCRIPTION = "JavaScript Object Notation (JSON) is a lightweight data interchange format. \
the Test::JSON manpage makes it easy to verify that you have built valid \
JSON and that it matches your expected output. \
 \
See the http://www.json.org/ manpage for more information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Test-JSON-0.11-1.26.noarch.rpm"
RPM_HASH = "cd9849c3b712f6229fc78038fb19834869968bd11d4e47a9e83b456c9d0589fe2daff13ff9228b61f5dda7a5c74d83999a6dc0d681d13ddd78c8090ef30b8f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--JSON \
perl-Test-JSON"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-JSON--Any \
perl-Test--Differences \
perl-Test--Tester"

inherit rpm
