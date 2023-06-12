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

RPROVIDES:${PN} += "libschily-devel \
libschily-devel(aarch-64)"
RDEPENDS:${PN} += "libcdrdeflt1_0 \
libdeflt1_0 \
libedc_ecc1_0 \
libedc_ecc_dec1_0 \
libfile1_0 \
libfind4_0 \
librmt1_0 \
libschily2_0 \
libxtermcap1_0"

inherit rpm
