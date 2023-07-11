SUMMARY = "Cryptsetup Documentation"
DESCRIPTION = "Documentation and man pages for cryptsetup"
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-doc-2.6.1-2.1.noarch.rpm"
RPM_HASH = "110223f4c888554891d95386b12721fad3b02d597d07fcc890e499c5d1dba64dab61d9350d84a8affd5503f8d5790eb26a0ad41b96311cafbf7cd0189162a035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cryptsetup-doc"

RDEPENDS:${PN} += ""

inherit rpm
