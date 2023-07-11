SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python310-apfel-3.0.6-1.19.aarch64.rpm"
RPM_HASH = "7c9fba6aa1040a84de6aa8267bd47b15c9932da770a341735ab908846fbaf7a26669c3243a02dc0517497a1ab952d28f3479b4b7fb3f130627d423b6cd133795"

RPROVIDES:${PN} += "python3.10dist-apfel \
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
