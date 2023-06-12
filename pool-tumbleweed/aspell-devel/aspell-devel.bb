SUMMARY = "Include Files and Libraries Mandatory for Development with aspell"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require aspell."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "aspell-devel-0.60.8-5.4.aarch64.rpm"
RPM_HASH = "68fc5ffb5b7db14bb20e0c9557845ef6652febafb2980c4ef0bed1ae7b0084a95d2f57f62ef7bae95338e0018b4f410da018093a5002f70b028e39adb4f20455"

RPROVIDES:${PN} += "aspell-devel \
aspell-devel(aarch-64) \
pspell-devel"
RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
info \
libaspell15 \
libpspell15"

inherit rpm
