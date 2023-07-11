SUMMARY = "Files for Developing with libtee"
DESCRIPTION = "This component provides the TEE Client API as defined by the GlobalPlatform \
TEE standard. For a general overview of OP-TEE, please see the Notice.md file. \
 \
This package contains the libvisio development files."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "optee-client-devel-3.9.0-1.12.aarch64.rpm"
RPM_HASH = "caff1b0fb5bbc36c1233a11cc69c2f2a8025ca6a470f0cd6268ead5b99cacba66e1db35b306289cbcbbe433c05cf9cd318f2406820a30b882666dcbdb3148f7e"

RPROVIDES:${PN} += "optee-client-devel"

RDEPENDS:${PN} += "libckteec0 \
libteec1"

inherit rpm
