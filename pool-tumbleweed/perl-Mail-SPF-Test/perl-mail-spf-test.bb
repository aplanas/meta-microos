SUMMARY = "SPF test-suite class"
DESCRIPTION = "  *Mail::SPF::Test* is a class for reading and manipulating SPF test-suite \
  data."
LICENSE = "BSD-3-Clause"

PV = "1.001"

RPM_NAME = "perl-Mail-SPF-Test-1.001-8.25.noarch.rpm"
RPM_HASH = "c3b68f043a3d704a23358529e5e548e8cf9f23232fe76ace4a9c73e772f1f8af85ce9851ec8cf922ecbb5f1b0f4afcc29d83e1102d2ffccabfd53a3be5af0458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--SPF--Test \
perl-Mail--SPF--Test--Base \
perl-Mail--SPF--Test--Case \
perl-Mail--SPF--Test--Scenario \
perl-Mail-SPF-Test"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Net--DNS \
perl-NetAddr--IP \
perl-YAML \
perl-version"

inherit rpm
