SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python310-apfel-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "f10749aaaa9dec1707984377aaabcf4adcf20ceb594c8320d9de07299bcbb7c27ed8757c80dbd545143c65812c6eaf600780b19ea3279e13f94c5ccdc450c03b"

RPROVIDES:${PN} += "python3-apfel \
python3.10dist-apfel \
python310-apfel \
python3dist-apfel"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libAPFEL.so.0 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python310-LHAPDF \
update-alternatives"

inherit rpm
