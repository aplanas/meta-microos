SUMMARY = "Python wrapper for Adobe's PostScript autohinter"
DESCRIPTION = "Python wrapper for Adobe's PostScript autohinter"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python311-psautohint-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "c3323a4558e3f44c8a29454f9dac8e38cd59f5bf2ee7fcc68ff62842bc2575c9da2f886a9ccedea64b044d42ebeb53689c2847791a24a4114fe1ca34fc0445de"

RPROVIDES:${PN} += "python3.11dist(psautohint) \
python311-psautohint \
python311-psautohint(aarch-64) \
python3dist(psautohint)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-FontTools \
python311-fs \
update-alternatives"

inherit rpm
