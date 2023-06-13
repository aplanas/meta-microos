SUMMARY = "Python module to patch python built-in objects"
DESCRIPTION = "This project allows you to patch built-in objects, declared in C through \
python."
LICENSE = "GPL-3.0-only | MIT"

PV = "0.1.3"

RPM_NAME = "python310-forbiddenfruit-0.1.3-2.17.aarch64.rpm"
RPM_HASH = "6aabc9fb61db96f28f6fd6fc13d6ab7170c305c45617380a5f4770b393c0acc25f832d714499f68ccd4211c1649205ae210a282583b35b6b82364fe413b43b55"

RPROVIDES:${PN} += "python3-forbiddenfruit \
python3.10dist(forbiddenfruit) \
python310-forbiddenfruit \
python310-forbiddenfruit(aarch-64) \
python3dist(forbiddenfruit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
