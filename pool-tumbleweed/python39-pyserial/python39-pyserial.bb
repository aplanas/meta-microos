SUMMARY = "Python Serial Port Extension"
DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python39-pyserial-3.5-3.2.noarch.rpm"
RPM_HASH = "b1800fb9c9eba0f9242a93ccb64f123bcb71b28dc2f143ab165227a0bf4dbc423fe60afffc39f6fb022c38cc904f06d5162a18b4067f9b65029a41d728a3492f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyserial \
python39-pyserial \
python39-serial \
python3dist-pyserial"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
