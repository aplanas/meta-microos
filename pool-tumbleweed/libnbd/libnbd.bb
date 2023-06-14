SUMMARY = "NBD client library in userspace"
DESCRIPTION = "NBD — Network Block Device — is a protocol for accessing Block Devices \
(hard disks and disk-like things) over a Network. \
 \
This is the NBD client library in userspace, a simple library for \
writing NBD clients. \
 \
The key features are: \
 \
 * Synchronous and asynchronous APIs, both for ease of use and for \
   writing non-blocking, multithreaded clients. \
 \
 * High performance. \
 \
 * Minimal dependencies for the basic library. \
 \
 * Well-documented, stable API. \
 \
 * Bindings in several programming languages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libnbd-1.14.1-2.1.aarch64.rpm"
RPM_HASH = "e7fc86cf88a4bf5eefc6db5e922c7b6e4e27e331e2cf4aa60f9870c7f787dddcbb65dae23671ced9e938f810df2407737c52a560478d73ef3914c84ab7ec340c"

RPROVIDES:${PN} += "libnbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnbd.so.0 \
libnbd0"

inherit rpm
