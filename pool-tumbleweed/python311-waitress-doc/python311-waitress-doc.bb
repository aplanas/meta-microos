SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python311-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python311-waitress-doc-2.1.2-5.1.noarch.rpm"
RPM_HASH = "0a5f76abd95dc7bb32c322681b5c8db37348a171c061a8c9da9aa8295cfa915133471670dd67fa0be7bbd358ccb8530138718604b7fc2067dae702b246ba16f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-waitress-doc \
python311-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
