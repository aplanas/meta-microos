SUMMARY = "HTTP MultiPart Parser"
DESCRIPTION = "This class provides a low-level API for processing MultiPart MIME data \
streams conforming to MultiPart types as defined in at \
http://tools.ietf.org/html/rfc2616#section-3.7.2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-HTTP-MultiPartParser-0.02-1.16.noarch.rpm"
RPM_HASH = "faa7194406a9a13cd72170f4f20fc6c8c3fe8fe4cb3a9e9f575a529b554aba5a0905412def58b9ce46d1d464489816abb5aab227423451a6df4ab811009e9813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--MultiPartParser \
perl-HTTP-MultiPartParser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
