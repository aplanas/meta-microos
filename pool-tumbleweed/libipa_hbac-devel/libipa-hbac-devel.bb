SUMMARY = "Development files for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libipa_hbac-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "a803fad4577e8a83f3668ff697d4e27c59bc73e477a80c1f6826854f7f4dbaef4d1abef23dca17e8459827fb8f20a93be2ec00042357686a4aff6e9c240632d6"

RPROVIDES:${PN} += "libipa-hbac-devel \
pkgconfig-ipa-hbac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libipa-hbac0"

inherit rpm
