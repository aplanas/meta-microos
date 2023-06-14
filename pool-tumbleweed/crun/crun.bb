SUMMARY = "OCI runtime written in C"
DESCRIPTION = "crun is a runtime for running OCI containers. It is built with libkrun support"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.3"

RPM_NAME = "crun-1.8.3-1.1.aarch64.rpm"
RPM_HASH = "5336c19cffc74a9dc634fd88e5a3986dc6b1fe7027336f6e0eb79da67a9c4f1030adcfa456c035b36971b4f5437a004460841994672cc8a34a9332ebd19f4e9c"

RPROVIDES:${PN} += "crun"

RDEPENDS:${PN} += "libc.so.6 \
libcap.so.2 \
libkrun1 \
libseccomp.so.2 \
libsystemd.so.0 \
libyajl.so.2"

inherit rpm
