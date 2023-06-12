SUMMARY = "Reproject astronomical images"
DESCRIPTION = "Reproject astronomical images"
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python39-reproject-0.9.1-1.5.aarch64.rpm"
RPM_HASH = "b4b08dd8e37426b5a06eec8c3e779703c4e116de388bbae03adb65bccec86f00efc18ff1d4a7b142d8a8ebdff9aa6926cac01804edf34f3a119810c8ee335a25"

RPROVIDES:${PN} += "python3.9dist(reproject) \
python39-reproject \
python39-reproject(aarch-64) \
python3dist(reproject)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-astropy \
python39-astropy-healpix \
python39-numpy \
python39-scipy"

inherit rpm
