SUMMARY = "NewGRF Meta Language"
DESCRIPTION = "A tool to compile nml files to grf or nfo files, making newgrf coding easier."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "nml-0.7.3-1.1.aarch64.rpm"
RPM_HASH = "5991a58700626ce843755f90f05de5d04fbd40e1a0444869c85bb8f6c04dc756e3ae171c5df850f37a7b3a0f023cc1ebaea66a0dbe96bb9fdb6cdd5a97050042"

RPROVIDES:${PN} += "nml \
nml(aarch-64) \
nmlc \
python3.10dist(nml) \
python3dist(nml)"
RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python3-Pillow \
python3-ply"

inherit rpm
