SUMMARY = "openSUSE Tumbleweed Brand File"
DESCRIPTION = "This package contains the file /etc/SUSE-brand, and its name is used as \
a trigger for installation of correct vendor brand packages."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "84.87.20230227"

RPM_NAME = "branding-openSUSE-84.87.20230227-2.1.noarch.rpm"
RPM_HASH = "fecbba897b2d64d68146eb9b28688e18acaa7b4d5705b8bd4fb0f58e14fff5913aa4e264066dfbb8e18ecb735c9582d212690543f05be7c997ea054ce91c4359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "branding \
branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
