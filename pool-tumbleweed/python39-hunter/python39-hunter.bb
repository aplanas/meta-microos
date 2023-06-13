SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "Hunter is a flexible code tracing toolkit, not for measuring coverage, \
but for debugging, logging, inspection and other nefarious purposes."
LICENSE = "BSD-2-Clause"

PV = "3.5.1"

RPM_NAME = "python39-hunter-3.5.1-1.5.aarch64.rpm"
RPM_HASH = "dff302beaceae929c2b1ef43403b7c0e579b5179f2d409b401e76b53571ba6b725ccefc19f8a6206be15a7452a7dc431972a49bb4b0cd8cad59b58808d55e18e"

RPROVIDES:${PN} += "python3.9dist(hunter) \
python39-hunter \
python39-hunter(aarch-64) \
python3dist(hunter)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
