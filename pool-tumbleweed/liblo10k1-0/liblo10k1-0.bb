SUMMARY = "Emu10k1 patch loader library"
DESCRIPTION = "This package contains the patch loader program for Emu10k1 and Emu10k1 on ALSA."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "liblo10k1-0-0.1.8p1-24.4.aarch64.rpm"
RPM_HASH = "af96c3efc9ce4da1a211562ce579453759697ee4f50ec36be258e93847149846f5b9f9434fa604bed49e465503fb8158e8313b31ea2d9d358dea5da3695af806"

RPROVIDES:${PN} += "liblo10k1-0 \
liblo10k1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
