SUMMARY = "Upload server for the data fetching service"
DESCRIPTION = "Upload server for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-uploadserver-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "ed840de84bc0f26a4346202711cdbcccfbd68406f9c0abe3f797bb159cacb0b09059c9f2bb2befc0eea3dc617909ca3635def8b11987263e92245b309af7d27e"

RPROVIDES:${PN} += "containerized-data-importer-uploadserver \
containerized-data-importer-uploadserver(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
