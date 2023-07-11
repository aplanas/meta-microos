SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
DESCRIPTION = "pysmb is an experimental SMB/CIFS library written in Python. It implements the client-side SMB/CIFS protocol which allows your Python application to access and transfer files to/from SMB/CIFS shared folders like your Windows file sharing and Samba folders."
LICENSE = "Zlib"

PV = "1.2.9.1"

RPM_NAME = "python310-pysmb-1.2.9.1-1.5.noarch.rpm"
RPM_HASH = "37f2f2d67e0f86790318a9e76db85b266ed537cb23ef61126585f6778ad5c623e99a8b3205605ab8cf04ce2512cfa8a5613a1e28a2f0059c565eb7c582574077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysmb \
python310-pysmb \
python3dist-pysmb"

RDEPENDS:${PN} += "python-abi \
python310-pyasn1"

inherit rpm
