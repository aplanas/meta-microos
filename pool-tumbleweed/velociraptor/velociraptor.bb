SUMMARY = "Endpoint visibility and collection tool"
DESCRIPTION = "Velociraptor is a tool for collecting host based state information \
using The Velociraptor Query Language (VQL) queries. \
 \
To learn more about Velociraptor, read the documentation on: \
 \
https://docs.velociraptor.app/ \
 \
This package contains the velociraptor server and full console GUI. \
For just the endpoint agent, please install the 'velociraptor-client' package."
LICENSE = "AGPL-3.0-only"

PV = "0.6.7.5~git81.01be570"

RPM_NAME = "velociraptor-0.6.7.5~git81.01be570-3.3.aarch64.rpm"
RPM_HASH = "5b515159c54293e924c56c2b807d22b2b130c3f36a71ff634604dcc495a1a0f18efbf38f73d9c3bbfe197e8a57e41dc3809c6782ac28da9632ea98ad9e075bb9"

RPROVIDES:${PN} += "config-velociraptor \
velociraptor"

RDEPENDS:${PN} += "/usr/bin/sh \
group-velociraptor \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
sysuser-shadow \
user-velociraptor"

inherit rpm
