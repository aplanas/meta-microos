SUMMARY = "GTK+ 3 support for the Greybird-geeko theme"
DESCRIPTION = "This package provides the GTK+ 3 support of Greybird-geeko."
LICENSE = "(CC-BY-SA-3.0 & GPL-3.0-or-later) | GPL-2.0-or-later"

PV = "3.23.1+git1.77c0887"

RPM_NAME = "gtk3-metatheme-greybird-geeko-3.23.1+git1.77c0887-3.1.noarch.rpm"
RPM_HASH = "f66fc34a53401e8c26d87ae5b03ce1283bae5b5596346813e50876d72ed94911a28d461da19c6e41b1286ec5b768e9939483d5f966bf376e0269ea4681c239d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-greybird-geeko"

RDEPENDS:${PN} += "metatheme-greybird-geeko-common"

inherit rpm
