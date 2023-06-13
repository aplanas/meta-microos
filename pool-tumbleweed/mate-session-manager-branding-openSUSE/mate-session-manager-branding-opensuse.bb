SUMMARY = "openSUSE Branding of mate-session-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the MATE Session Manager."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-session-manager-branding-openSUSE-42.1-5.5.noarch.rpm"
RPM_HASH = "92f37c01f081cd3b8a3718bd25c45fa1e7aa61e1a0c58f68c93058f12254e5ca9d97990b6c2ecbfaca930750afa3f858b3f9fcf742653bbec0a724d9293a39d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-session-manager-branding-openSUSE) \
mate-session-manager-branding \
mate-session-manager-branding-openSUSE"

RDEPENDS:${PN} += "/bin/sh \
mate-icon-theme \
mate-session-manager \
metatheme-numix-common \
wallpaper-branding-openSUSE"

inherit rpm
