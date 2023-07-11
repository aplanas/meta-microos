SUMMARY = "InterNetNews development files"
DESCRIPTION = "Rich Salz's InterNetNews news transport system. \
 \
This package contains the files needed to develop software depending on \
inn."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "inn-devel-2.6.5-1.9.aarch64.rpm"
RPM_HASH = "4db21020f3b6c7ac8e7322d1a4a2406f48d61f9114bd85fa5e11b069c6582fa79303d179e42d5e786b8600df2ff2d79fc87ef5d4291eaf1ca7af568635ee0652"

RPROVIDES:${PN} += "inn-devel"

RDEPENDS:${PN} += "bison \
gdbm-devel \
inn \
pam-devel \
zlib-devel"

inherit rpm
