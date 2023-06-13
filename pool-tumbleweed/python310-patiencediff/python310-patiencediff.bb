SUMMARY = "Python implementation of the patiencediff algorithm"
DESCRIPTION = "Python implementation of the patiencediff algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "python310-patiencediff-0.2.12-1.4.aarch64.rpm"
RPM_HASH = "e919d9058dad3a039d336660a1b8e8f8a0cb421ea1e0dd548fa3796ff3eb2459e52d93c793511495be9144e265efc72856c39a32c5a3d84c95be68fd6df8e774"

RPROVIDES:${PN} += "python3-patiencediff \
python3.10dist(patiencediff) \
python310-patiencediff \
python310-patiencediff(aarch-64) \
python3dist(patiencediff)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
