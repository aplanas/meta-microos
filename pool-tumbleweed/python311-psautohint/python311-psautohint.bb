SUMMARY = "Python wrapper for Adobe's PostScript autohinter"
DESCRIPTION = "Python wrapper for Adobe's PostScript autohinter"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python311-psautohint-2.4.0-1.11.aarch64.rpm"
RPM_HASH = "f4c5f87cd89330b15c977c787fcb1524a9abd8d71d5397240a2b6aa1771905f8a1bdf029482367e134066badb7667dd874a3ac1863d498fa82b430cce8dfdad5"

RPROVIDES:${PN} += "python3-psautohint \
python3.11dist-psautohint \
python311-psautohint \
python3dist-psautohint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-FontTools \
python311-fs \
update-alternatives"

inherit rpm
