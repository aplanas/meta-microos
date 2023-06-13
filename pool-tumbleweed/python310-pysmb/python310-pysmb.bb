SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
DESCRIPTION = "pysmb is an experimental SMB/CIFS library written in Python. It implements the client-side SMB/CIFS protocol which allows your Python application to access and transfer files to/from SMB/CIFS shared folders like your Windows file sharing and Samba folders."
LICENSE = "Zlib"

PV = "1.2.9.1"

RPM_NAME = "python310-pysmb-1.2.9.1-1.3.noarch.rpm"
RPM_HASH = "791904815964ffc0b54962732ad5e941b683a10d895166868ebc878865088cd9452afc5fd3ff6696fa4c873a705379cc71015888a36c8907026ed8dbd0160b06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysmb \
python3.10dist(pysmb) \
python310-pysmb \
python3dist(pysmb)"

RDEPENDS:${PN} += "python(abi) \
python310-pyasn1"

inherit rpm
