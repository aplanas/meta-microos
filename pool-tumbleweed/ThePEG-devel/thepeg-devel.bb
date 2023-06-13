SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the header and source files needed for development with \
ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.2.3"

RPM_NAME = "ThePEG-devel-2.2.3-1.8.aarch64.rpm"
RPM_HASH = "c87344687b7f3e53c31dfd43156ab67aef91c628acc727f8a8d041e923f19de0c838838e15dfdf0ec23ffe25686f8de16b9f80b9441b34a47977dd00cf6f9279"

RPROVIDES:${PN} += "ThePEG-devel \
ThePEG-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ThePEG-libs \
ld-linux-aarch64.so.1()(64bit) \
libThePEG.so.30()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
