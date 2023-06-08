SUMMARY = "Data fetching service"
DESCRIPTION = "Data fetching service for VM container imagess"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-importer-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "b0b334058b3e6f6474f76659c802f917caa30317de880906806234129b9c165f95d86ef241453c663afa005302db474416ec79d05f8e94c2511e2b42945ef3ef"

RPROVIDES:${PN} += "containerized-data-importer-importer containerized-data-importer-importer(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
