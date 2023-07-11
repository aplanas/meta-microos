SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
DESCRIPTION = "pysmb is an experimental SMB/CIFS library written in Python. It implements the client-side SMB/CIFS protocol which allows your Python application to access and transfer files to/from SMB/CIFS shared folders like your Windows file sharing and Samba folders."
LICENSE = "Zlib"

PV = "1.2.9.1"

RPM_NAME = "python311-pysmb-1.2.9.1-1.5.noarch.rpm"
RPM_HASH = "53d4828cdd6c7ccb633c7a3c6d4e5d8b080b0a17ee823983b15a07fa585af13788f3c86e97dad8ec815893181302b52e6157530529d260b99cc459d29e5b2f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysmb \
python3.11dist-pysmb \
python311-pysmb \
python3dist-pysmb"

RDEPENDS:${PN} += "python-abi \
python311-pyasn1"

inherit rpm
