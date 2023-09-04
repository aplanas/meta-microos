SUMMARY = "Data fetching service"
DESCRIPTION = "Data fetching service for VM container imagess"
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "containerized-data-importer-importer-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "0c6f64b53f9021c16d0d15b202a38c64057cb3ac9a7d3a831b0a85a3f5b77d140e6adf651c4987da2a88cc47485f2b1a304dadf314c40f3528bd4b3b8dacc008"

RPROVIDES:${PN} += "containerized-data-importer-importer"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
