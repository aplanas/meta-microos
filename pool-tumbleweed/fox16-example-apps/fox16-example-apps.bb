SUMMARY = "Example applications for the FOX GUI toolkit"
DESCRIPTION = "The example-apps package contains executables for several FOX-based \
applications, including: \
 \
* Adie : Programmer's Text Editor \
 \
* calculator : Calculator Applet \
 \
* shutterbug : Screenshot Utility \
 \
* PathFinder : File Browser"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-example-apps-1.6.57-4.1.aarch64.rpm"
RPM_HASH = "6d3bdf807f1b0f226635c266923d49782f6269e499519cc642e624eb1e1fe5694a1f565c8dd6fd7c98cda2daa603f532a8a4a015719473d3d9ac809eeb11a7e2"

RPROVIDES:${PN} += "fox-example-apps \
fox16-example-apps"

RDEPENDS:${PN} += "libFOX-1.6.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
