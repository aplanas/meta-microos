SUMMARY = "Python module to access DMI data"
DESCRIPTION = "python-dmidecode is a python extension module that uses the code-base \
of the 'dmidecode' utility, and presents the data as python data \
structures or as XML data using libxml2."
LICENSE = "GPL-2.0-only"

PV = "3.12.3"

RPM_NAME = "python310-dmidecode-3.12.3-4.3.aarch64.rpm"
RPM_HASH = "c3c27362a99bcd5483eb0dcecf2e2ecf32faeb33dae63ebbdb2b8660a4225f254509ee2a458545619c442ff748719a3401017850a612c48433069a393eec10f1"

RPROVIDES:${PN} += "python3.10dist-python-dmidecode \
python310-dmidecode \
python3dist-python-dmidecode"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxml2mod.cpython-310-aarch64-linux-gnu.so \
python-abi \
python310 \
update-alternatives"

inherit rpm
