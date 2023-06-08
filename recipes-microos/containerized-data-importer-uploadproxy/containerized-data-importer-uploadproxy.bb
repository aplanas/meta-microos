SUMMARY = "Upload proxy for the data fetching service"
DESCRIPTION = "Upload proxy for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-uploadproxy-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "7b618638b3c367161ab1dee17e05d54851e0320c1fb1f600625150b7a810778b54a8b94041e9b0010d877d3ef969472d82bd16a6a2d925320a1db530e1626498"

RPROVIDES:${PN} += "containerized-data-importer-uploadproxy containerized-data-importer-uploadproxy(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
