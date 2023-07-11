SUMMARY = "openSUSE theme for Enlightenment"
DESCRIPTION = "openSUSE, theme for Enlightenment"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220430.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-20220430.1.26-1.11.noarch.rpm"
RPM_HASH = "3609da5d4030e21b03d50c5f81457267c5ca6124550a51e7904c2dbbdc40986cf78a876cfa007f96eb60d19d0b821f05d9136cd9930f7093440e20a65dfc881f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-dft \
enlightenment-theme-openSUSE"

RDEPENDS:${PN} += "elementary"

inherit rpm
