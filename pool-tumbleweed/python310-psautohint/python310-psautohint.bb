SUMMARY = "Python wrapper for Adobe's PostScript autohinter"
DESCRIPTION = "Python wrapper for Adobe's PostScript autohinter"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python310-psautohint-2.4.0-1.11.aarch64.rpm"
RPM_HASH = "676b5ff8d26dfbe3315d0ff1283dafcf4fe1d1b8fa44fdd84f6000473cb8bc2774238704bd4029337a1f2405fe67555424a1cc4fce9571a85665006551cae102"

RPROVIDES:${PN} += "python3.10dist-psautohint \
python310-psautohint \
python3dist-psautohint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-FontTools \
python310-fs \
update-alternatives"

inherit rpm
