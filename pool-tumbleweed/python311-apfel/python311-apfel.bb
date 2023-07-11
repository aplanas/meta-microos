SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python311-apfel-3.0.6-1.19.aarch64.rpm"
RPM_HASH = "9d2f338d4e7565e12820ea792298843768c4fd8abe9e6b226d9b80b02abe4b71009911083f16449ba035e7113f06e98e13b276bf5ab5d17325dfb57d9dd93b5e"

RPROVIDES:${PN} += "python3-apfel \
python3.11dist-apfel \
python311-apfel \
python3dist-apfel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libAPFEL.so.0 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-LHAPDF \
update-alternatives"

inherit rpm
