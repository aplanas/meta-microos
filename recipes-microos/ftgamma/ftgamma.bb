SUMMARY = "Screen gamma calibration helper"
DESCRIPTION = "Screen gamma calibration helper \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftgamma-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "52596b0aea4ccde746d0c075c238fb4ec54f633548fe5d3ddc98b52b559adf51efb25d5f381d780243c71167ea06d6d131dba34fa54cd000abda1cadf4a31823"

RPROVIDES:${PN} += "ftgamma ftgamma(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
