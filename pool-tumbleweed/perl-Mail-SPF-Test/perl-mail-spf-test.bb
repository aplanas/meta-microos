SUMMARY = "SPF test-suite class"
DESCRIPTION = "  *Mail::SPF::Test* is a class for reading and manipulating SPF test-suite \
  data."
LICENSE = "BSD-3-Clause"

PV = "1.001"

RPM_NAME = "perl-Mail-SPF-Test-1.001-8.26.noarch.rpm"
RPM_HASH = "ec743dd4dc8516d8aa88794bfe9d2458741c6c6b87f8f366c21aee260a531ad08bdcf77fcac1a200c50fe1dd84042160c8d5596744f0d3b1a84c35c88ce05356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--SPF--Test \
perl-Mail--SPF--Test--Base \
perl-Mail--SPF--Test--Case \
perl-Mail--SPF--Test--Scenario \
perl-Mail-SPF-Test"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Net--DNS \
perl-NetAddr--IP \
perl-YAML \
perl-version"

inherit rpm
