SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "python39-apfel-3.0.6-1.19.aarch64.rpm"
RPM_HASH = "c83c7065f110cf572974e51a2f677805be493648ae78a64a5097003c63620d1c598ce5584d74472cd36926f354e67adb4d15890a7622671d1fd6626b2928bb56"

RPROVIDES:${PN} += "python3.9dist-apfel \
python39-apfel \
python3dist-apfel"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
