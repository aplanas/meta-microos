SUMMARY = "Type hints for NumPy"
DESCRIPTION = "Type hints for NumPy."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python311-nptyping-2.4.1-1.5.noarch.rpm"
RPM_HASH = "7e8cd853e53acb4e7ed5750bf8900b57ad5b22173a590dfac01acd5164d4f807f9d8b49e3ac79ee6ab034e890f5073a2ecff4af532d60cd59aefc833660595f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nptyping \
python3.11dist-nptyping \
python311-nptyping \
python3dist-nptyping"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
