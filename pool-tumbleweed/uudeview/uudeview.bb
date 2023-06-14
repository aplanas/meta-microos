SUMMARY = "The Nice and Friendly Decoder"
DESCRIPTION = "The UUDeview package contains a very smart decoder and an encoder for \
Base64 (MIME), uuencoded, xxencoded, Binhex, and yEnc files. Its \
ultimate goal is to fully replace the 'standard', but dumb uudecode and \
uuencode utilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.20"

RPM_NAME = "uudeview-0.5.20-260.15.aarch64.rpm"
RPM_HASH = "d2cfa0f4fdcaf3683c31aa4e54dd9c19e95f5e3011cdb5f02c9c074bd36c2b85b37beef35ee0e08284f85c1f8f40d847f56d28785af9cf67840373f1cf0e3370"

RPROVIDES:${PN} += "sharutils-/usr/bin/uudeview \
uudeview"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
