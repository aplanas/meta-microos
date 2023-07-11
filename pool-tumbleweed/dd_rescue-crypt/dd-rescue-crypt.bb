SUMMARY = "Crypt plugin for dd_rescue"
DESCRIPTION = "This plugin allows you do de/encrypt files during recovery copying \
with dd_rescue using the AES family of algorithms. The plugin \
supports various numbers of bits and rounds and uses the x86 AESNI \
CPU support if available. \
 \
The plugin does offer a variety of options to handle the keys \
and IVs including the generating keys from password and salt. \
 \
The plugin is new as of 1.98 and it despite diligent testing it \
might be careful to expect some bugs and future changes."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.99.13"

RPM_NAME = "dd_rescue-crypt-1.99.13-2.3.aarch64.rpm"
RPM_HASH = "90a4688283cf5424bad0b2221f4945e1bf2d4c4c1e64a5a044097004a2869d6e001bd3214e3f262e26e4aec26723db4582a7bda9b9fbd11870f9bbbd80eb5d9e"

RPROVIDES:${PN} += "dd-rescue-crypt \
libddr-crypt.so"

RDEPENDS:${PN} += "dd-rescue \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.1"

inherit rpm
