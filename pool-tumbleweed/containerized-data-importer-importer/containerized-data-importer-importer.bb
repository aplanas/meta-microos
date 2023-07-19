SUMMARY = "Data fetching service"
DESCRIPTION = "Data fetching service for VM container imagess"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-importer-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "46ba6e6675e74cf9d62a56352cefa8d8c518d33db8ccbde25491e8cc3de9393d95976ba41a080f8d5e2fa6940cf83ae79f983a23533d87f3402a05f75cdc7e20"

RPROVIDES:${PN} += "containerized-data-importer-importer"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
