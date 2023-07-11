SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-arabic-reshaper-3.0.0-1.5.noarch.rpm"
RPM_HASH = "fae7116b30f6be5689eea8e9fe8cf8ca573be5f7471bcf55b7efc0c32e48b2099298fbfcfa6ef746a4bddc3a9939604fdbc9e2d4037f0b9a7cd411998c278ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arabic-reshaper \
python39-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi \
python39-future"

inherit rpm
