SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "libdatovka4-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "120a19b6f1c06feee24cde9807f5e83b3d2a6c925635dc77e75043823c42c34ba792bedeeecc20c413cecab8f1e0c18aa0962241b828d58a1423be4729f21d4f"

RPROVIDES:${PN} += "libdatovka.so.4 \
libdatovka4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libgpgme.so.11 \
libxml2.so.2"

inherit rpm
