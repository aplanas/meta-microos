SUMMARY = "The Nice and Friendly Decoder"
DESCRIPTION = "The UUDeview package contains a very smart decoder and an encoder for \
Base64 (MIME), uuencoded, xxencoded, Binhex, and yEnc files. Its \
ultimate goal is to fully replace the 'standard', but dumb uudecode and \
uuencode utilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.20"

RPM_NAME = "uudeview-0.5.20-260.16.aarch64.rpm"
RPM_HASH = "6eaf22035137c8b0e1bf2347787575c994d830fc1315dd1fab236492249ee108e3875edc741477b4ac47f8c1a76a8fd5858a57aecc894f5874673d7a032c9334"

RPROVIDES:${PN} += "sharutils-/usr/bin/uudeview \
uudeview"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
