SUMMARY = "Moka Icon theme"
DESCRIPTION = "Moka is a simple and modern icon theme with Material Design influences."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "5.4.0"

RPM_NAME = "moka-icon-theme-5.4.0-1.3.noarch.rpm"
RPM_HASH = "7fffbb6e6d5f06456b4efe7504fbc5b8b8f018f209f8f88ffc334fed41d49441143ecbc26f7be65b97b08cf244c2b95effbbcd0e95df9dd1e77501cd7b7aa8e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moka-icon-theme"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
