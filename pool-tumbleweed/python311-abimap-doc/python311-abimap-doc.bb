SUMMARY = "Symbol versioning helper (Documentation)"
DESCRIPTION = "Documentation for the symbol versioning helper python311-abimap"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-abimap-doc-0.3.2-3.12.noarch.rpm"
RPM_HASH = "0c37d8209ddfcef1885b3d50d61a9d97a7577cb56b7a142f4092eeb935bef442cf6a125b0c763bdef1867baa8008d645e16bce4a77c850bca5a1479fc849c569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abimap-doc \
python311-abimap-doc"

RDEPENDS:${PN} += ""

inherit rpm
