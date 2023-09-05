SUMMARY = "Scripts for KDE software development"
DESCRIPTION = "This package contains scripts useful for development of KDE software."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kdesdk-scripts-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "29ea35b0453dbd24eecde4df433c5d26e8284c2fd2191103d1d9b101e64260d5088f4d2cca68dfdc5e62c765a815b7c617414ab0eab5f14974570e0114e894a7"

RPROVIDES:${PN} += "kde-dev-scripts \
kdesdk-scripts \
kdesdk4-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
