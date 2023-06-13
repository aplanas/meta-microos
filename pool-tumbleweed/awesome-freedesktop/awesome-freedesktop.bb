SUMMARY = "Desktop entries and menu for awesome"
DESCRIPTION = "This project aims to add support for freedesktop.org compliant \
desktop entries and menu. \
 \
Main features: \
 * a freedesktop.org-compliant (or almost) applications menu. \
 * a freedesktop.org-compliant (or almost) desktop. \
 * a (yet limited) icon lookup function. \
 \
You can choose any icon theme that's installed in /usr/share/icons/."
LICENSE = "GPL-2.0+"

PV = "git201701091085"

RPM_NAME = "awesome-freedesktop-git201701091085-1.15.noarch.rpm"
RPM_HASH = "bcdfe5c89ee8c5ebf9487b13c90b0dc32f252b78cbb4bc6addfe0b9153cd1a21b2c6be2eb7cb1ede424f9e74d04e3e6863ad9f5ae067ac1e45d0bf0c952c879c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-freedesktop"

RDEPENDS:${PN} += "awesome"

inherit rpm
