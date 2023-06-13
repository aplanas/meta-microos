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

RPM_NAME = "dd_rescue-crypt-1.99.13-2.2.aarch64.rpm"
RPM_HASH = "475ed1db87f032d64ee66ee56af498a075b4056e2eeb2736f40383d759e345cae9d810b2d313d8cfb26ad8e1a415b4025fbd8f65b52b0135ab365e770b068425"

RPROVIDES:${PN} += "dd_rescue-crypt \
dd_rescue-crypt(aarch-64) \
libddr_crypt.so()(64bit)"

RDEPENDS:${PN} += "dd_rescue \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.1.1()(64bit) \
libcrypto.so.1.1(OPENSSL_1_1_0)(64bit)"

inherit rpm
