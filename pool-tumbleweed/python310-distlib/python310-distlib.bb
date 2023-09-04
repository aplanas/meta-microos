SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.7"

RPM_NAME = "python310-distlib-0.3.7-1.1.noarch.rpm"
RPM_HASH = "ce5bdf33530e12b5a82cf98a3d4df945a7d315a4b6f06378ab2b65804422520cf4e883f3d654044fc68add7dcffe08e09d14b77e56806349a873b332afd22e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-distlib \
python310-distlib \
python3dist-distlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
