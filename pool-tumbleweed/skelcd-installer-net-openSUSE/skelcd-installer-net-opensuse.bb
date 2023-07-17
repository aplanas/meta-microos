SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-net-openSUSE-17.89-1.40.aarch64.rpm"
RPM_HASH = "cb0c90b8805744a5aaf390ac8b6e13fbcb5329a227bb2a7a31eca169be952b0eb353c9e3bd9d6a3b8a4bf237168bed833ae775200755462ae15d9f8e5c54b723"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
