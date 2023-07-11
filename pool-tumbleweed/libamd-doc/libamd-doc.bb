SUMMARY = "Documentation for libamd"
DESCRIPTION = "Documentation for libamd."
LICENSE = "BSD-3-Clause"

PV = "5.13.0"

RPM_NAME = "libamd-doc-5.13.0-49.2.aarch64.rpm"
RPM_HASH = "def9a5710e4fa6c7e086657b705d75730e5d6e281bb568ad619f7da2c51ae0c401e661984e6ce2d828d7eb1ce9b262d82af8f3622a135482d0fa59c4e278cf49"

RPROVIDES:${PN} += "libamd-doc"

RDEPENDS:${PN} += ""

inherit rpm
