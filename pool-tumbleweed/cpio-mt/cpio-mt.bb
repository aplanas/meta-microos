SUMMARY = "Tape drive control utility"
DESCRIPTION = "This package includes the 'mt', a local tape drive control program."
LICENSE = "GPL-3.0-only"

PV = "2.13"

RPM_NAME = "cpio-mt-2.13-5.3.aarch64.rpm"
RPM_HASH = "e45a5717878af02508302706b64bbfae1fca5de6fa57635ffa8a20eb8ed451162749dac1eba9562e56da12df4296a7bf0567bdba3a4bc8a720e3e2f8cdc8bdd7"

RPROVIDES:${PN} += "cpio-mt \
mt"

RDEPENDS:${PN} += "/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
