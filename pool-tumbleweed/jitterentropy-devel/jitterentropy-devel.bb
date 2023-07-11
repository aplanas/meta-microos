SUMMARY = "Jitter entropy generator development header and library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the development header and library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "jitterentropy-devel-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "b835136ab68fc9697426e474c910c811b334c7e1c564f8946517d1dd4a2c5db81ae69bc15115fcc511d9a0bcf3944f12847f33b0991b6013e4a8febd1ce77ec3"

RPROVIDES:${PN} += "jitterentropy-devel"

RDEPENDS:${PN} += "libjitterentropy3"

inherit rpm
