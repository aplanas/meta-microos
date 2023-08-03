SUMMARY = "TPM2 Enhanced System API (ESAPI)"
DESCRIPTION = "This API is a 1-to-1 mapping of the TPM2 commands documented in Part 3 of the \
TPM2 specification. Additionally there are asynchronous versions of each \
command. In addition to SAPI, the ESAPI performs tracking of meta data for \
TPM object and automatic calculation of session based authorization and \
encryption values. Both the synchronous and asynchronous API are exposed \
through this library."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-esys0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "75a8b05c005082627dd4a0656deefb38b36ec5e4da410e9499792c1551617d049aac27467588e03efd563ac5896dd3f43bcff0828eebb9a0fd1f0ee5977738ea"

RPROVIDES:${PN} += "libtss2-esys.so.0 \
libtss2-esys0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtss2-mu.so.0 \
libtss2-sys.so.1"

inherit rpm
