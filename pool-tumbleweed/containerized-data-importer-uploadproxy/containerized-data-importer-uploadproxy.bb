SUMMARY = "Upload proxy for the data fetching service"
DESCRIPTION = "Upload proxy for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-uploadproxy-1.56.0-1.5.aarch64.rpm"
RPM_HASH = "19a900d0d56a7feb627d1f00720196aa67440cddbd76ab471d086735847faebf6d5bcdd77f2234990f547972fb17d09dd6671a07b5c8506e61359a6c9982da22"

RPROVIDES:${PN} += "containerized-data-importer-uploadproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
