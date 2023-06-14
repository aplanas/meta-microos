SUMMARY = "A Program to Extract Microsoft Cabinet Files"
DESCRIPTION = "Cabinet (.CAB) files are a form of archive, which Microsoft uses to \
distribute their software and things like Windows Font Packs. \
cabextract can be used to unpack these files."
LICENSE = "GPL-3.0-or-later"

PV = "1.11"

RPM_NAME = "cabextract-1.11-1.2.aarch64.rpm"
RPM_HASH = "c7939e8a0e3a05e1ded868360b1aaac91d65c01e2249b3737350be38cf05de1130445b97fd4c6ab167ebbc4defc6c8f1686d8930780c316dc69209be2c5cabc2"

RPROVIDES:${PN} += "cabextract"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmspack.so.0"

inherit rpm
