SUMMARY = "CDI API server"
DESCRIPTION = "The containerized-data-importer-api package provides the kubernetes API extension for CDI"
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "containerized-data-importer-api-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "34475683b75bc87af54a12759c0ae328ad1dc277279911d87138c1d2f538dce1b99899fe192bb6f9950669b4955e0a5413b2dd434da1b6177edf8b877c5476dd"

RPROVIDES:${PN} += "containerized-data-importer-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
