SUMMARY = "Library for commandline flag processing"
DESCRIPTION = "The gflags package contains a library that implements commandline \
flags processing. As such, it is a replacement for getopt(). It has \
increased flexibility, including built-in support for C++ types like \
string, and the ability to define flags in the source file in which \
they're used."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-2.2.2-3.1.aarch64.rpm"
RPM_HASH = "de728e5fe86c5e7f8e0283b5c9e452d909ac410a72f18283b4c43c5343932bb77ad4351bd382f08b9c0d14d47c48fa3e0592adcb2df6b33c7fe298901fe0e0e5"

RPROVIDES:${PN} += "gflags"

RDEPENDS:${PN} += "/usr/bin/bash \
libgflags2-2"

inherit rpm
