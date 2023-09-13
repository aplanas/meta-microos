SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-net-MicroOS-17.91-1.98.aarch64.rpm"
RPM_HASH = "f89c22f53899c0abe904f4d820914701934d5c4a95b4b8aefef217b5248fabeead27254e6b6ee62aadb5b7f90ff802aad1142642859efb759df3f117ae9ca9c0"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
