SUMMARY = "Development Environment for collectd clients"
DESCRIPTION = "Library which abstracts communication with the collectd \
unixsock plugin for clients. \
This package contains the required development environment \
to write collectd unixsock clients."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "libcollectdclient-devel-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "d920d916ea00c831cb992cd83dfa3b829dbe1981adaaa03fe66c7c3f3fd7a631fe3e480ccdf95ad68c76dfe8a17ca15e7b874bdfa152b58142791f15c875d5b1"

RPROVIDES:${PN} += "libcollectdclient-devel \
pkgconfig-libcollectdclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcollectdclient1"

inherit rpm
