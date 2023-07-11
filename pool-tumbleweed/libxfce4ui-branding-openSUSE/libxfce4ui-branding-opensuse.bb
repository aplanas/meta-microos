SUMMARY = "openSUSE Branding of libxfce4ui"
DESCRIPTION = "This package provides the openSUSE look and feel for the libxfce4ui library."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "libxfce4ui-branding-openSUSE-4.18.0+git0.9a2f754-1.6.noarch.rpm"
RPM_HASH = "3ee528c1959c7d1af730592152303c1116246ded87393f092cbb18e770871fccf778618d0c60fc330ccc5fb2c95b99bc969579a8d038a8d6a8ae24ad716b1610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libxfce4ui-branding-openSUSE \
libxfce4ui-branding \
libxfce4ui-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
