SUMMARY = "Endpoint visibility and collection tool (endpoint only)"
DESCRIPTION = "Velociraptor is a tool for collecting host based state information \
using The Velociraptor Query Language (VQL) queries. \
 \
To learn more about Velociraptor, read the documentation on: \
 \
https://docs.velociraptor.app/ \
 \
This package contains only the endpoint agent.  For the full server and GUI \
console, please install the 'velociraptor' package."
LICENSE = "AGPL-3.0-only"

PV = "0.6.7.5~git81.01be570"

RPM_NAME = "velociraptor-client-0.6.7.5~git81.01be570-3.2.aarch64.rpm"
RPM_HASH = "a2f5604b7fc222d215f466f4efaed44b0bb4c859ec3370da02951494892adb8c3eb747ddd41549a32446af94908e79932460c3d88893bb2c18db0ae4022e7640"

RPROVIDES:${PN} += "config-velociraptor-client \
velociraptor-client"

RDEPENDS:${PN} += "/bin/sh \
group-velociraptor \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
user-velociraptor"

inherit rpm
