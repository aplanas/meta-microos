SUMMARY = "Data fetching service"
DESCRIPTION = "Data fetching service for VM container imagess"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-importer-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "7684fbe4057d6a3e5296af196239e966d6934db87117bb601b639ea6c9d6a908e959bb4175855cf272f3cb8ce8312341b460783ac8b159711ade04380da34e0f"

RPROVIDES:${PN} += "containerized-data-importer-importer"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
