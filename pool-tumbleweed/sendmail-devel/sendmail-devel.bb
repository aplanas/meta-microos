SUMMARY = "BSD Sendmail Development Kit"
DESCRIPTION = "This package includes libraries and header files for building tools to \
access sendmail features. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "sendmail-devel-8.17.1-9.1.aarch64.rpm"
RPM_HASH = "7047cffee9415c74fea526cf7127aff2cb0a57da9b11d75bc136cc7b2aafd6f3e91f56b8a2ca984bc1fb82598d5d08836e6e819246362a7ea82c080a97c5f402"

RPROVIDES:${PN} += "sendmail-devel \
sendmail-devel(aarch-64)"
RDEPENDS:${PN} += "libmilter1_0"

inherit rpm
