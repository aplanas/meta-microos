SUMMARY = "The qtpy.tests module"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
This subpackage separately provides the qtpy.tests module \
in order to avoid stupid rpmlint errors."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-QtPy-test-2.3.0-2.3.noarch.rpm"
RPM_HASH = "15f93379a8e5158fb3b7fc324a0e10ec015d526e4991459dd25d9b82ccaaf7c977194b0761dcfd4262bc6b77c19657b8e7299f502f643a93af930ca191ebe231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtPy-test \
python311-QtPy-test"

RDEPENDS:${PN} += "python-abi \
python311-QtPy"

inherit rpm
