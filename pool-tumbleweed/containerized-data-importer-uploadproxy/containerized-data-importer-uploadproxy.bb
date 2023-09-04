SUMMARY = "Upload proxy for the data fetching service"
DESCRIPTION = "Upload proxy for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "containerized-data-importer-uploadproxy-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "ca73f7ab6d165ebdf7d36813e01c24e33634ffdba09ca69e82357d068d92690c9ee59c21e0452f0613cc2b5718689c37af43fe838170ebe1176a33824afd0872"

RPROVIDES:${PN} += "containerized-data-importer-uploadproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
