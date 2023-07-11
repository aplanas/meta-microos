SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
DESCRIPTION = "pysmb is an experimental SMB/CIFS library written in Python. It implements the client-side SMB/CIFS protocol which allows your Python application to access and transfer files to/from SMB/CIFS shared folders like your Windows file sharing and Samba folders."
LICENSE = "Zlib"

PV = "1.2.9.1"

RPM_NAME = "python39-pysmb-1.2.9.1-1.5.noarch.rpm"
RPM_HASH = "2a2a27b43686a78b05dced28970c7b289cb50287dcddaa5e7af9ce818b0e9fd6d0a712e762e98120909b2e5b8a653a2361a4ce1d2c759c92bad1e17de11c9e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysmb \
python39-pysmb \
python3dist-pysmb"

RDEPENDS:${PN} += "python-abi \
python39-pyasn1"

inherit rpm
