SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library provides support for developing programs using LTTng \
userspace tracing."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "lttng-ust-devel-2.13.5-1.3.aarch64.rpm"
RPM_HASH = "88fdc481a6598fc89fce989aad777debd5b1a942a247bc8a702b5c9c99a0ed55a3fa9badb32da94efa731f9ba6e204b2b122aa1c38a3e51ef85170d4b71a67b6"

RPROVIDES:${PN} += "lttng-ust \
lttng-ust-devel \
lttng-ust-devel(aarch-64) \
pkgconfig(lttng-ust) \
pkgconfig(lttng-ust-ctl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
liblttng-ust-ctl5 \
liblttng-ust-python-agent1 \
liblttng-ust1 \
pkgconfig(liburcu)"

inherit rpm
