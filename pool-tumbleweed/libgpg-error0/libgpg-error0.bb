SUMMARY = "Library That Defines Common Error Values for All GnuPG Components"
DESCRIPTION = "This is a library that defines common error values for all GnuPG \
components.  Among these are GPG, GPGSM, GPGME, GPG-Agent, libgcrypt, \
pinentry, SmartCard Daemon, and possibly more in the future."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.47"

RPM_NAME = "libgpg-error0-1.47-1.2.aarch64.rpm"
RPM_HASH = "d9919391d508fb7e3886030b1eadb88217ac7a71a29d9c0e6993cec1944ba1a3e2166466a8cc350712adfc94a62f7b4fb6701d5d39ac8aa367724f37f12d4473"

RPROVIDES:${PN} += "libgpg-error \
libgpg-error.so.0 \
libgpg-error0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
