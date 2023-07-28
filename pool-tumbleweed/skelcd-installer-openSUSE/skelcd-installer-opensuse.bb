SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-openSUSE-17.89-1.57.aarch64.rpm"
RPM_HASH = "28ec14d7c8d28525a7f0292d545c613a07216a3963edf0fc05e929a33192aa2584713e25048cf9fc88dc8b566298142f525c78f6a601d12cebc1f20a9e4a7d79"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
