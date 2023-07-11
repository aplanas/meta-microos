SUMMARY = "The OpenSLP Implementation of the Service Location Protocol V2"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks. \
 \
This package contains the SLP server. Every system, which provides any \
services that should be used via an SLP client must run this server and \
register the service."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "openslp-server-2.0.0-21.5.aarch64.rpm"
RPM_HASH = "65fa5833674869b753ee9724d651dc1ada32706a4eef37ae290a34bd8469b83a5b1b8b4ca5b78904ff573bd6aaa1a60138dce78a4fb73747edd5ef1869d7875d"

RPROVIDES:${PN} += "config-openslp-server \
openslp-server"

RDEPENDS:${PN} += "/usr/bin/sh \
group-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libsystemd.so.0 \
openslp \
shadow \
systemd"

inherit rpm
