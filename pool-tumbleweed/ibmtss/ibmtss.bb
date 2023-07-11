SUMMARY = "IBM's TPM 2.0 TSS"
DESCRIPTION = "This is a user space TCG Software Stack (TSS) for TPM 2.0. It \
implements the functionality equivalent to the TCG TSS working \
group's planned ESAPI, SAPI, and TCTI APIs. \
 \
It comes with over 100 'TPM tools' that can be used for scripted \
apps, rapid prototyping, education, and debugging."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ibmtss-1.6.0-4.5.aarch64.rpm"
RPM_HASH = "d033bc08ba03638512822bcbac812a403e0e07b617002313bd4e3437e141f26fced2533b02ffe3b264910524cb8dd1c966a5affd6eaf38978cb3a8336695cb3d"

RPROVIDES:${PN} += "ibmtss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libibmtss.so.1 \
libibmtssutils.so.1"

inherit rpm
