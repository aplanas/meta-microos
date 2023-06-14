SUMMARY = "SQLAlchemy to Django integration library"
DESCRIPTION = "SQLAlchemy to Django integration library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-aldjemy-1.0.0-3.1.noarch.rpm"
RPM_HASH = "a74495113ab629daa71e7552e87ee56cd96777b2bbfb0fb5b272f0430c1c02c78940a1c97a7b625c8a378874b6c9e25bf85b758c5ad842b86eb18d6965e764b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aldjemy \
python311-aldjemy \
python3dist-aldjemy"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-SQLAlchemy"

inherit rpm
