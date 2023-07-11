SUMMARY = "Tools to generate digital room correction filters"
DESCRIPTION = "DRC is a program used to generate correction filters for acoustic compensation \
of HiFi and audio systems in general, including listening room compensation. DRC \
generates just the FIR correction filters, which can be used with a real time or \
offline convolver to provide real time or offline correction. DRC doesn't \
provide convolution features, and provides only some simplified, although really \
accurate, measuring tools."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.3"

RPM_NAME = "drc-3.2.3-1.15.aarch64.rpm"
RPM_HASH = "52883cef78851a723b47dfc128fead4325ada074136a1a418f8673ccb15ef270b0ff290c55191099e42c08e15771e1df4dfb38df193b4bafaef85bf40230695c"

RPROVIDES:${PN} += "drc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
