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

RPM_NAME = "velociraptor-client-0.6.7.5~git81.01be570-3.3.aarch64.rpm"
RPM_HASH = "2de72011a2a547b5ca35b0b1109dc7106cdaa8f09fe2d5eb3c7037f523bedb7b39c957ad23833215b577648e8013aff854b5fff4b78b81ba4fbc9924ff345173"

RPROVIDES:${PN} += "config-velociraptor-client \
velociraptor-client"

RDEPENDS:${PN} += "/usr/bin/sh \
group-velociraptor \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
user-velociraptor"

inherit rpm
