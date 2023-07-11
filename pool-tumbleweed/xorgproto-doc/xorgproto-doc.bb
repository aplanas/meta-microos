SUMMARY = "The X11 Protocol collection (documentation)"
DESCRIPTION = "Documentation for X11 protocol headers."
LICENSE = "MIT"

PV = "2023.2"

RPM_NAME = "xorgproto-doc-2023.2-1.1.noarch.rpm"
RPM_HASH = "ef4423c9ba4d1e7adb929c7e5257ca493b233b8ff776fc9ded0f528271c7153e1e8a09799f91b4b7fe9bd414d8297ff0c10be22afb13b34f0dc5b891a1960ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorgproto-doc"

RDEPENDS:${PN} += ""

inherit rpm
