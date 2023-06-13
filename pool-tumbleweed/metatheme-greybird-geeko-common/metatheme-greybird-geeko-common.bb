SUMMARY = "Common files for the Greybird theme"
DESCRIPTION = "The Greybird theme for GTK2/3/4 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral grey-ish look. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes as well as background images."
LICENSE = "(CC-BY-SA-3.0 & GPL-3.0-or-later) | GPL-2.0-or-later"

PV = "3.23.1+git1.77c0887"

RPM_NAME = "metatheme-greybird-geeko-common-3.23.1+git1.77c0887-3.1.noarch.rpm"
RPM_HASH = "f4042a9a107d21eb96c846972dfc9322df43e33625e06fcb0e3cbb9000896202a9efedc134cce981222553defda2a3c0ddf06e4b2a07a51b9ddf3600abd0b3d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-greybird-geeko-common"

RDEPENDS:${PN} += ""

inherit rpm
