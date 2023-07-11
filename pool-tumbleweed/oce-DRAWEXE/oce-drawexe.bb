SUMMARY = "Scripting interface to the OpenCASCADE libraries"
DESCRIPTION = "This program provides a kind of scripting interface to the OpenCASCADE \
libraries. You can perform a simple test by starting it and entering at the \
command line: 'pload ALL' then 'source /usr/share/oce/src/DrawResources/VisualizationDemo.tcl'."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "0.18.3"

RPM_NAME = "oce-DRAWEXE-0.18.3-3.4.aarch64.rpm"
RPM_HASH = "10f143e9293f539642c8d2508f0b22dd1f023481244dfae9442a10aa6e9b38b3d5001fb952dbdb09045b62c20161040b11ed20a706603a9bbd2c2e2a6a84e181"

RPROVIDES:${PN} += "oce-DRAWEXE"

RDEPENDS:${PN} += "libTKDraw.so.11 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
