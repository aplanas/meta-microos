SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python311-apfel-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "6fd6596441986422ce2de93bd21c8e45cab4f8ae7fbe00cee11dae6d3cfe2604f37f57fbc41bb1d94a4a8b6702da94cc7f30dc3b63d211a06267b2a1b25125b0"

RPROVIDES:${PN} += "python3.11dist-apfel \
python311-apfel \
python3dist-apfel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
