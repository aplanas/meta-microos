SUMMARY = "Type hints for NumPy"
DESCRIPTION = "Type hints for NumPy."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python39-nptyping-2.4.1-1.5.noarch.rpm"
RPM_HASH = "197e37e4720e1194089bdee7c71b0587a7a957d11d33ab9d47e37111be3d61d114e1a97f744ff84d0922a3fd76c46148b186546e2eef8a398e0968b4e2948bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nptyping \
python39-nptyping \
python3dist-nptyping"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-typing-extensions"

inherit rpm
