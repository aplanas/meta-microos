SUMMARY = "BSD Sendmail Development Kit"
DESCRIPTION = "This package includes libraries and header files for building tools to \
access sendmail features. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.2"

RPM_NAME = "sendmail-devel-8.17.2-1.1.aarch64.rpm"
RPM_HASH = "674d707eb08f60f400097a19a6b03acd1977ef23b468d9b20ce9d21aecabe295e8e7452566226f20292fab0e9464a29553a3c75bac344503bf269ad5c0f09130"

RPROVIDES:${PN} += "sendmail-devel"

RDEPENDS:${PN} += "libmilter1-0"

inherit rpm
