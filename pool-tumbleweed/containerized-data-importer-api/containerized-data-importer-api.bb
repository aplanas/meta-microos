SUMMARY = "CDI API server"
DESCRIPTION = "The containerized-data-importer-api package provides the kubernetes API extension for CDI"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-api-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "681e40adfbca720a7557f1f7185c7aeede333e0db18dbff8406fc8d57f9e3bc9b8f62f93c5bc54d6c275f78c1d1480002fdfb13a344191ea27bcccde2b040c20"

RPROVIDES:${PN} += "containerized-data-importer-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
