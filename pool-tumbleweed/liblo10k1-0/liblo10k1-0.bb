SUMMARY = "Emu10k1 patch loader library"
DESCRIPTION = "This package contains the patch loader program for Emu10k1 and Emu10k1 on ALSA."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "liblo10k1-0-0.1.8p1-24.3.aarch64.rpm"
RPM_HASH = "f6a1205b30357a4e16cd1ce47b5fa4598fbd8c19792513e1ed949f65ae3bcb3290b36df99ecb24c660facc61cc48993285b2fb52d72ab3ba207fb8c01013bccd"

RPROVIDES:${PN} += "liblo10k1-0 \
liblo10k1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
