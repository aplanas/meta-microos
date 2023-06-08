SUMMARY = "Upload server for the data fetching service"
DESCRIPTION = "Upload server for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-uploadserver-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "44effe7fd993fc1b43bda6f8b560fcd10d6808b0f9e3f7f19733ffb2f309b956e564bdfa942acaabeb3fc94d13bb1365fb7a3f61444c382c38f64b5fee1ce193"

RPROVIDES:${PN} += "containerized-data-importer-uploadserver containerized-data-importer-uploadserver(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
