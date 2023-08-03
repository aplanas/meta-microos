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

RPM_NAME = "velociraptor-0.6.7.5~git81.01be570-4.1.aarch64.rpm"
RPM_HASH = "6d69a2d914810d9a207899500c219542422e8edb03b8f8eaffbeac0e28dcef3f3161b1a8bc4db4008fc8e1e8c22ebaf0c8560eefa2d7b657a3d4b6f8c5ff11ba"

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
