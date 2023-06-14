SUMMARY = "openSUSE Branding of libxfce4ui"
DESCRIPTION = "This package provides the openSUSE look and feel for the libxfce4ui library."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "libxfce4ui-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "6f146a4b202e1ebf54a44837a17303a67391adb25955917b9eeab63bb85360dd975c687a74dac97e0ba36780668813d7cb2fd0d6aeac708ff27bd57bad80f764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libxfce4ui-branding-openSUSE \
libxfce4ui-branding \
libxfce4ui-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
