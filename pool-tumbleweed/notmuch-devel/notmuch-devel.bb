SUMMARY = "Development files for notmuch"
DESCRIPTION = "The notmuch-devel package contains libraries and header files for \
developing applications that use notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-devel-0.37-2.4.aarch64.rpm"
RPM_HASH = "1fb9b3a3be1c2768ea01b3faec541231a928bdd0e5a5f55d463c272decacf360e8ec6c80ba9e607bdf0ac7a922c2d817a5c114f6a6899261670040fa0a95c924"

RPROVIDES:${PN} += "notmuch-devel \
notmuch-devel(aarch-64)"

RDEPENDS:${PN} += "libnotmuch5"

inherit rpm
