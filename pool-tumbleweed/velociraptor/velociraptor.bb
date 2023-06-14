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

RPM_NAME = "velociraptor-0.6.7.5~git81.01be570-3.2.aarch64.rpm"
RPM_HASH = "f1adbfdb5bd43481686c90bbfebac0741196f1daa0b12326dd0902cc60c9c5db105b31d5c336fd1a4b1c96c5de43b9c7fd120854d90428bc16a6e3da5247bd3d"

RPROVIDES:${PN} += "config-velociraptor \
velociraptor"

RDEPENDS:${PN} += "/bin/sh \
group-velociraptor \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
sysuser-shadow \
user-velociraptor"

inherit rpm
