SUMMARY = "A light openSUSE theme modified to suite the openSUSE 13.2 artwork"
DESCRIPTION = "Ice is a light theme for enlightenment, this version has been modified to suite the artwork for openSUSE 13.2"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-ice-20220219.1.26-1.12.noarch.rpm"
RPM_HASH = "2d5578414aaafb38e7ae5ef598c1823124e70646faae59bc74e547c1a930db05a910c69a576017aea17f4346209ae6d127228978a760f38625461625dd8365e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-openSUSE-ice"

RDEPENDS:${PN} += ""

inherit rpm
