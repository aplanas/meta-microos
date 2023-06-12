SUMMARY = "Python Serial Port Extension"
DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python310-pyserial-3.5-3.1.noarch.rpm"
RPM_HASH = "90be84793d16b0811df75e47df375793b6993d2e518ac6e9a633a4bd9fcf07d1ca3c0bd6f9f5bd7d460999d7e450ed5fbd9981b7c8b928fa5a9c2e868160b7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyserial \
python3-serial \
python3.10dist(pyserial) \
python310-pyserial \
python310-serial \
python3dist(pyserial)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
