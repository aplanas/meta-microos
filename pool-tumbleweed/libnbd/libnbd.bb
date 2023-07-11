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

RPM_NAME = "libnbd-1.14.1-2.2.aarch64.rpm"
RPM_HASH = "c1bfed27e977797a83f34fe75bf1596c771ffcf2f9e9a2ca220cb1e1b0af6fb6cfb2720faaca4b7c3b98d96a8408bc5be3e87a3547a1c970cb1d0aba68b12757"

RPROVIDES:${PN} += "libnbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnbd.so.0 \
libnbd0"

inherit rpm
