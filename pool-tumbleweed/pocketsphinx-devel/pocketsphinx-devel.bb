SUMMARY = "Development files for pocketsphinx, a speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time. \
 \
This is the development package for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "pocketsphinx-devel-0.8-5.16.aarch64.rpm"
RPM_HASH = "69e431e5d33ee8f015720c9192767c7eda6ff695c49756f9df3a9a619f7e7c291f800b9a6f2e806ca2ee60e7ee847e87c14887eb9abdbaad896e611fe4dddd92"

RPROVIDES:${PN} += "pkgconfig-pocketsphinx \
pocketsphinx-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpocketsphinx1 \
pkgconfig-sphinxbase"

inherit rpm
