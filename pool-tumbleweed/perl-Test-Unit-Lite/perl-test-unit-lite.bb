SUMMARY = "Unit testing without external dependencies"
DESCRIPTION = "This framework provides lighter version of the Test::Unit manpage \
framework. It implements some of the the Test::Unit manpage classes and \
methods needed to run test units. The the Test::Unit::Lite manpage tries to \
be compatible with public API of the Test::Unit manpage. It doesn't \
implement all classes and methods at 100% and only those necessary to run \
tests are available. \
 \
The the Test::Unit::Lite manpage can be distributed as a part of package \
distribution, so the package can be distributed without dependency on \
modules outside standard Perl distribution. The the Test::Unit::Lite \
manpage is provided as a single file."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.1202"

RPM_NAME = "perl-Test-Unit-Lite-0.1202-5.24.noarch.rpm"
RPM_HASH = "7e63ec9af2c9b81810fde5330a8566aa35e8892ee7253f3910496fdc442ba862fa8d5c1693e66de53f7d62b49176f834cb3e2d5aedfba42953b39b03b0fb515d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Unit--Debug \
perl-Test--Unit--HarnessUnit \
perl-Test--Unit--Lite \
perl-Test--Unit--Lite--AllTests \
perl-Test--Unit--Result \
perl-Test--Unit--TestCase \
perl-Test--Unit--TestRunner \
perl-Test--Unit--TestSuite \
perl-Test-Unit-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
