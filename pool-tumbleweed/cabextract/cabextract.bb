SUMMARY = "A Program to Extract Microsoft Cabinet Files"
DESCRIPTION = "Cabinet (.CAB) files are a form of archive, which Microsoft uses to \
distribute their software and things like Windows Font Packs. \
cabextract can be used to unpack these files."
LICENSE = "GPL-3.0-or-later"

PV = "1.11"

RPM_NAME = "cabextract-1.11-1.3.aarch64.rpm"
RPM_HASH = "c0e43cb9b2ee7906e35fa6e48b1c0c36101295b81f5755ef9e7da365aeaaf46d0655f18bf7603019f8a22533f1df0defa2f8cfdad44edf4e721f3a5c9272dca2"

RPROVIDES:${PN} += "cabextract"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmspack.so.0"

inherit rpm
