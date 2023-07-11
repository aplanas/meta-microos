SUMMARY = "Python Serial Port Extension"
DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python310-pyserial-3.5-3.2.noarch.rpm"
RPM_HASH = "a32caf55a90fe660c122c3f0e4fb527699f16cc5ff6ea2246a6af1d66a4b488a3099139ea4a72a3e8162103cccbe5fbfcb1647dc8ba44fa59306d8a250ab6ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyserial \
python310-pyserial \
python310-serial \
python3dist-pyserial"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
