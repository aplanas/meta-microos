SUMMARY = "Library for commandline flag processing"
DESCRIPTION = "The gflags package contains a library that implements commandline \
flags processing. As such, it is a replacement for getopt(). It has \
increased flexibility, including built-in support for C++ types like \
string, and the ability to define flags in the source file in which \
they're used."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-2.2.2-3.2.aarch64.rpm"
RPM_HASH = "c184b52184af9f17cf455411606b62283942e6de9bb453dada26f0d41b8f25fb61e53effcfbb0515f1765129c7da2fed93eeb82ae29b9c350b03bee9dee0c8c0"

RPROVIDES:${PN} += "gflags"

RDEPENDS:${PN} += "/usr/bin/bash \
libgflags2-2"

inherit rpm
