SUMMARY = "Include Files and Libraries Mandatory for Development with aspell"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require aspell."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "aspell-devel-0.60.8-5.5.aarch64.rpm"
RPM_HASH = "1826b4c0137334b7ecfbbb75069f81383471a7cb7a8c30102dc3b5e7a5dd7fb998c46581b5250ab3069a7cb320d300485c4aca09c787db7f9c6eb6d08e6099db"

RPROVIDES:${PN} += "aspell-devel \
pspell-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
info \
libaspell15 \
libpspell15"

inherit rpm
