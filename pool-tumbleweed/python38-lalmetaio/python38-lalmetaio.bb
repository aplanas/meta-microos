SUMMARY = "LSC Algorithm MetaIO Library"
DESCRIPTION = "The LSC Algorithm MetaIO Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "python38-lalmetaio-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "73c81680e6e5a9018fda63ea42ee0b15efe2bc1b787de4926c438edd3ce97b7e0649b34653825b2971c40f855b3f7f09c7205dd0554f24580878e7d9fbdea451"

RPROVIDES:${PN} += "python38-lalmetaio \
python38-lalmetaio(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblal.so.20()(64bit) \
liblalmetaio.so.10()(64bit) \
liblalsupport.so.14()(64bit) \
python(abi) \
python38-lal \
python38-numpy"

inherit rpm
