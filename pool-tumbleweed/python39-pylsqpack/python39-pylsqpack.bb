SUMMARY = "Python ls-qpack QPACK library"
DESCRIPTION = "Python wrapper for the ls-qpack QPACK library."
LICENSE = "BSD-3-Clause"

PV = "0.3.16"

RPM_NAME = "python39-pylsqpack-0.3.16-1.4.aarch64.rpm"
RPM_HASH = "b04edf4af0ec6b74c7b9add0169cecea6850242380b336af87a716af0af599fe7cad55c203a22fefa9bacae8f113ae38bbc3c18f32978d0af02adead11f1ebec"

RPROVIDES:${PN} += "python3.9dist(pylsqpack) \
python39-pylsqpack \
python39-pylsqpack(aarch-64) \
python3dist(pylsqpack)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
