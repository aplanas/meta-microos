SUMMARY = "Scripting interface to the OpenCASCADE libraries"
DESCRIPTION = "This program provides a kind of scripting interface to the OpenCASCADE \
libraries. You can perform a simple test by starting it and entering at the \
command line: 'pload ALL' then 'source /usr/share/oce/src/DrawResources/VisualizationDemo.tcl'."
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "0.18.3"

RPM_NAME = "oce-DRAWEXE-0.18.3-3.3.aarch64.rpm"
RPM_HASH = "9692e0567f5a087c73871f6f72a7f8b843c830740504cd0c8d7738a4fe87ae1a0f62b8e6128d3377ff0f9da482444a2b5b05af8bba3a61ece15170ba5c9084e3"

RPROVIDES:${PN} += "oce-DRAWEXE \
oce-DRAWEXE(aarch-64)"

RDEPENDS:${PN} += "libTKDraw.so.11()(64bit) \
libc.so.6()(64bit)"

inherit rpm
