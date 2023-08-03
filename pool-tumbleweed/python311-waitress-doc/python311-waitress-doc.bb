SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python311-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python311-waitress-doc-2.1.2-6.1.noarch.rpm"
RPM_HASH = "bcf6a578aa5ec175552d4ab5557987ba1095c5f9953dfec0461ab5d58035fe7d35d83849d45e14f75a890194eb2e110b98d7898703a56c94f9a0809dbded299f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-waitress-doc \
python311-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
