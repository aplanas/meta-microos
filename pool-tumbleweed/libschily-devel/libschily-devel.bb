SUMMARY = "Development files for libschily"
DESCRIPTION = "libschily contains many OS abstraction functions used by the Schily \
tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libschily."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libschily-devel-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "6a3896988589562949c8d4a97c1d72e0855476de41caefa04299f0d99c95f4f2e3bf06dfce52272363ddb484f8a5fc25df39c43a851b958900f7378482ea1667"

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
