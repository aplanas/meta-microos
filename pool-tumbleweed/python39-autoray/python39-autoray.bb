SUMMARY = "A lightweight python automatic-array library"
DESCRIPTION = "Write backend agnostic numeric code compatible with any numpy-ish array library."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "python39-autoray-0.6.3-1.1.noarch.rpm"
RPM_HASH = "19e26eca9aa759e6a403072cf8549b906893566854abc633d0069df021b156ff12f9e78beb83c6247868be0652957bef3446d849aadee3c71b772fa8772b18ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(autoray) \
python39-autoray \
python3dist(autoray)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
