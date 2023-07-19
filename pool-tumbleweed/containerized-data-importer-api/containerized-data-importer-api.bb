SUMMARY = "CDI API server"
DESCRIPTION = "The containerized-data-importer-api package provides the kubernetes API extension for CDI"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-api-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "9ef7c5ebb67ceb11199a6bfa94d5aeeaf31c6bef4a03a60611171ea418d48f1ff2da1cc39f12f39adb105705251b79d2368c02ab0fc936c950816fb60942db9e"

RPROVIDES:${PN} += "containerized-data-importer-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
