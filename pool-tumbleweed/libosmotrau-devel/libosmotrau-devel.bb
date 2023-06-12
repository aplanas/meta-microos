SUMMARY = "Development files for the Osmocom TRAU (E1/RTP) library"
DESCRIPTION = "This library implements the Transcoder and Rate Adaptation Unit \
(TRAU) for GSM systems. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmotrau."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libosmotrau-devel-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "6cf65aeb3b0b1098adcbcfc7bfd933636dd70435517fbed560c73870a016d77dd73635d141133e8faea2747d07f2d2a026a0b39f9617c964c57bb0bcc8fc4cef"

RPROVIDES:${PN} += "libosmotrau-devel \
libosmotrau-devel(aarch-64) \
pkgconfig(libosmotrau)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmotrau2 \
pkgconfig(libosmocore)"

inherit rpm
