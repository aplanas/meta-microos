SUMMARY = "GTK+ 4 support for the Greybird-geeko theme"
DESCRIPTION = "This package provides the GTK+ 4 support of Greybird-geeko."
LICENSE = "(CC-BY-SA-3.0 & GPL-3.0-or-later) | GPL-2.0-or-later"

PV = "3.23.1+git1.77c0887"

RPM_NAME = "gtk4-metatheme-greybird-geeko-3.23.1+git1.77c0887-3.1.noarch.rpm"
RPM_HASH = "d5bafa990e2be32b0e4838e03240874c82234809fb3240d4a9e2ca61364444dd19dbb48054e19a0e5f96eef6d70d9dca8fa9274faa0bf87af2992998059606c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-greybird-geeko"

RDEPENDS:${PN} += "metatheme-greybird-geeko-common"

inherit rpm
