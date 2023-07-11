SUMMARY = "Development files for libschily"
DESCRIPTION = "libschily contains many OS abstraction functions used by the Schily \
tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libschily."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libschily-devel-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "b38d9a444a4d5f253c75d9fedad8fbaa55b1d0a1b3b8fc55ec284b8ec184ca68d24dd5611c0b2e8623d62b9db7cf89aa20f90fe22603280b2abc468bf2512bb9"

RPROVIDES:${PN} += "libschily-devel"

RDEPENDS:${PN} += "libcdrdeflt1-0 \
libdeflt1-0 \
libedc-ecc-dec1-0 \
libedc-ecc1-0 \
libfile1-0 \
libfind4-0 \
librmt1-0 \
libschily2-0 \
libxtermcap1-0"

inherit rpm
