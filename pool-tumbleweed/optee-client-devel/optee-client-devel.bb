SUMMARY = "Files for Developing with libtee"
DESCRIPTION = "This component provides the TEE Client API as defined by the GlobalPlatform \
TEE standard. For a general overview of OP-TEE, please see the Notice.md file. \
 \
This package contains the libvisio development files."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "optee-client-devel-3.9.0-1.11.aarch64.rpm"
RPM_HASH = "70762ed7c32afd774a5e8708ea79e834a930382672032b0d006f0ee756a9d6c7ec50e3fa0c6fa65d1450d8a2ba9fb81ec200644e355864bf3ab582a24799fe1c"

RPROVIDES:${PN} += "optee-client-devel"

RDEPENDS:${PN} += "libckteec0 \
libteec1"

inherit rpm
