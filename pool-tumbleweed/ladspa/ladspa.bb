SUMMARY = "The Linux Audio Developer's Simple Plug-In API"
DESCRIPTION = "The Linux Audio Developer's Simple Plug-in API (LADSPA) provides the \
ability to write simple plug-in audio processors in C/C++ and link them \
dynamically.  This package contains the plugins built from LADSPA SDK."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17"

RPM_NAME = "ladspa-1.17-1.9.aarch64.rpm"
RPM_HASH = "a9819da6888cadf6fa4810806c62aa2f6275a4388671bc8ead2ffb067ea03188a9aeb489d6a7e06f1fbcc0900357b3259cced7ab9648162002e1dcab9d8f8f40"

RPROVIDES:${PN} += "ladspa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
