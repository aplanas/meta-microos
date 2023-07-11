SUMMARY = "Development libraries for BLACS (openmpi2)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi2-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "ac42a13c165c13eef8ac5ddd174c4f738cf3bcf7a87b7a4b9db29484c28770beaf333209978c562693b7d2b4b40fdd267d7bfd4c9b0b164361bfac1d031fdf67"

RPROVIDES:${PN} += "libblacs2-openmpi2-devel-static"

RDEPENDS:${PN} += "libblacs2-openmpi2-devel"

inherit rpm
