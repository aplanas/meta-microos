SUMMARY = "Development files for the C++ interface of gdl"
DESCRIPTION = "gdlmm provides a C++ interface to the gdl library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.3"

RPM_NAME = "gdlmm-devel-3.7.3-8.22.aarch64.rpm"
RPM_HASH = "820753d64e27a84fd23f8f5098a28edd1a734cd6fd4e3d2dcb51e509a80ebb7aba03f6360a7ce8cb92901738926c4e4595b162ef8ea99fb6a06a3269d693245e"

RPROVIDES:${PN} += "gdlmm-devel \
gdlmm-devel(aarch-64) \
pkgconfig(gdlmm-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdlmm-3_0-2 \
pkgconfig(gdl-3.0) \
pkgconfig(glibmm-2.4) \
pkgconfig(gtkmm-3.0)"

inherit rpm
