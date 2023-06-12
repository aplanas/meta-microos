SUMMARY = "Data fetching service"
DESCRIPTION = "Data fetching service for VM container imagess"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-importer-1.56.0-1.4.aarch64.rpm"
RPM_HASH = "f7c7fc5927af1d7489a6af20791a99fc9709bfb1cd022b007e26dae2c0501f7a1a726ccdf891c359b28c44168c630c88acafd33dade563b59837ac5b5feb5e8b"

RPROVIDES:${PN} += "containerized-data-importer-importer containerized-data-importer-importer(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
