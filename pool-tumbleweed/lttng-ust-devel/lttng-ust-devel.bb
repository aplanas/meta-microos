SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library provides support for developing programs using LTTng \
userspace tracing."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "lttng-ust-devel-2.13.5-1.4.aarch64.rpm"
RPM_HASH = "289fb9339a82b0de5b2a46c3ef7daa80b6dbd7d8b978f36185f9bb685415433f42948dee5504a3522578d73895669e9992c001af39c4ce44134ce85f92e47d41"

RPROVIDES:${PN} += "lttng-ust \
lttng-ust-devel \
pkgconfig-lttng-ust \
pkgconfig-lttng-ust-ctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
liblttng-ust-ctl5 \
liblttng-ust-python-agent1 \
liblttng-ust1 \
pkgconfig-liburcu"

inherit rpm
