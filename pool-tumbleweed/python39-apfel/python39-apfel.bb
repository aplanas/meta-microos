SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python39-apfel-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "8c9b8e555125c2cc02e8a06f28dd23dfcbc42a2979754882eb8e287ef97bbb12b5a5a0dc8687aa0a47af7aba38274bf2528cc7f23ae2a20a6b3963d6902ddd09"

RPROVIDES:${PN} += "python3.9dist-apfel \
python39-apfel \
python3dist-apfel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libAPFEL.so.0 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-LHAPDF \
update-alternatives"

inherit rpm
