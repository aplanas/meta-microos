SUMMARY = "Icewm theme branding"
DESCRIPTION = "This package is made for SLE or openSUSE customization of icewm, including \
the system default theme,background etc."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.2.5"

RPM_NAME = "icewm-theme-branding-1.2.5-4.5.noarch.rpm"
RPM_HASH = "b299d7d1dcf61c19a11308f2fd20fe0caa4fe12433449a73c811371c9fd382af86003614cb10506ab8e8200ed115b0075806cac7d6d4613c10e55db3b9be30ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(icewm-theme-branding) \
icewm-configuration-files \
icewm-theme-branding"

RDEPENDS:${PN} += "/bin/sh \
icewm"

inherit rpm
