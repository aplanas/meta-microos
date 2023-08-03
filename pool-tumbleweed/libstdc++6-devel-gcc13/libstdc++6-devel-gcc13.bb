SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libstdc++6-devel-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "7f2db2827fc61f4472fdbb4684e8a9e386fdf553d65960daf596b9011a43de67f1cfc05f6119264d490a5dfc0df340965afc75c6d7dafcc855525132106fb0b7"

RPROVIDES:${PN} += "libstdc++6-devel-gcc13"

RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
