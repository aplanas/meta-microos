SUMMARY = "Rmail of the BSD Sendmail"
DESCRIPTION = "Rmail interprets incoming mail received via uucp and passing the \
processed mail on to the MTA (e.g. sendmail)."
LICENSE = "Sendmail"

PV = "8.17.2"

RPM_NAME = "rmail-8.17.2-1.1.aarch64.rpm"
RPM_HASH = "b4bf3fbb293d357cfc51bb55fef15faf1bf686d283581f6af27e6028a3f8f5139baa7160eb039d90535904218a8a07ec442719d6a4e553ec4ae76d2406924d58"

RPROVIDES:${PN} += "rmail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
