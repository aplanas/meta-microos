SUMMARY = "Computer Sound Synthesis and Composition Program"
DESCRIPTION = "Csound is a software synthesis program. It is modular and \
supports an unlimited amount of oscillators and filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-6.18.1-3.2.aarch64.rpm"
RPM_HASH = "df8bdb8ef6a577000991960ef7bced54cad34b394ea17ae410f6b601e30f7d311d5585df961a891caa58cc9bb0ae683440742e7eb0c83e6d3156625741a6142c"

RPROVIDES:${PN} += "csound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcsound64.so.6.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
