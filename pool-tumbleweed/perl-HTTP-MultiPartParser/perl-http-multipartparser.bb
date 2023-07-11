SUMMARY = "HTTP MultiPart Parser"
DESCRIPTION = "This class provides a low-level API for processing MultiPart MIME data \
streams conforming to MultiPart types as defined in at \
http://tools.ietf.org/html/rfc2616#section-3.7.2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-HTTP-MultiPartParser-0.02-1.15.noarch.rpm"
RPM_HASH = "7807eaf6a79f7b07dee04a8920839b758b005258ee1173f95d10d7608acce04d1fc10295820574b79d2990c603b4eb1eee156c7f5033201bb4ad6bd4953f5604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--MultiPartParser \
perl-HTTP-MultiPartParser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
