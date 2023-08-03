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

RPM_NAME = "velociraptor-client-0.6.7.5~git81.01be570-4.1.aarch64.rpm"
RPM_HASH = "59167032e7fb34f6b39900f90556741a449a64971f3a2016d085904f4a5f986fb3148e7e50e75aa256d26ed76d614e151daed0d8c73cbc1ae783de0dd013e6ee"

RPROVIDES:${PN} += "config-velociraptor-client \
velociraptor-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
