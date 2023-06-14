SUMMARY = "Type hints for NumPy"
DESCRIPTION = "Type hints for NumPy."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python310-nptyping-2.4.1-1.3.noarch.rpm"
RPM_HASH = "c06558dc335997939e8ee3af4c32011bee95f468dcf4b416c58e2fa06ecd1c8bea5eb5ae6122ab95862c964f9ab7d17d878710744dced9ce406832ac9b11206e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nptyping \
python3.10dist-nptyping \
python310-nptyping \
python3dist-nptyping"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
