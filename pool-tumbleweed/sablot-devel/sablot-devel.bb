SUMMARY = "Header Files and Libraries for Sablot Development"
DESCRIPTION = "Header files and libraries needed for sablot development."
LICENSE = "GPL-2.0+"

PV = "1.0.3"

RPM_NAME = "sablot-devel-1.0.3-130.29.aarch64.rpm"
RPM_HASH = "72d99a769c23e7d34540f8f5090bf1da442336aea7482992132335783dc436bc94359d7aca1dbb1a66bcee37642c1db83c4c4a003fa394605c1fb58b7527ed5b"

RPROVIDES:${PN} += "sablot-devel \
sablotd"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
sablot"

inherit rpm
