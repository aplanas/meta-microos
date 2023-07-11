SUMMARY = "Python Serial Port Extension"
DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python311-pyserial-3.5-3.2.noarch.rpm"
RPM_HASH = "bfee7802f8e1ef9d0de5baeed7b3c7e88482c6f3235d10deeabc46b60c81dd652d5e5bbe14ec0631b56599815a0873db0ef58c866e056065aacc5a08f25f3116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyserial \
python3-serial \
python3.11dist-pyserial \
python311-pyserial \
python311-serial \
python3dist-pyserial"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
