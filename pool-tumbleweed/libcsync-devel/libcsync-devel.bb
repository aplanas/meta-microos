SUMMARY = "Development files for csync"
DESCRIPTION = "The libcsync-devel package contains the static libraries and header \
files needed for development with csync."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-devel-0.50.0-11.9.aarch64.rpm"
RPM_HASH = "f837edd9d0cf8c6df8de09d879d639e03395fa2d800f96c5fc2a93c968a79baacae32f95d4086fe6b6406a310abc687e5dda18491c5d29df6e5a103948c90630"

RPROVIDES:${PN} += "libcsync-devel"

RDEPENDS:${PN} += "libcsync0"

inherit rpm
