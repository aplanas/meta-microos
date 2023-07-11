SUMMARY = "Development Environment for collectd clients"
DESCRIPTION = "Library which abstracts communication with the collectd \
unixsock plugin for clients. \
This package contains the required development environment \
to write collectd unixsock clients."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "libcollectdclient-devel-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "832eac129bdd7310dd92e5f84414992dd4dff1c9c0b9c60b474ebb0def8910d5ac29c6d4018bd9c205d26803ee83b50c1c1293e91de85d398079db54ea42af22"

RPROVIDES:${PN} += "libcollectdclient-devel \
pkgconfig-libcollectdclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcollectdclient1"

inherit rpm
