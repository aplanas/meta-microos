SUMMARY = "Python module to access DMI data"
DESCRIPTION = "python-dmidecode is a python extension module that uses the code-base \
of the 'dmidecode' utility, and presents the data as python data \
structures or as XML data using libxml2."
LICENSE = "GPL-2.0-only"

PV = "3.12.3"

RPM_NAME = "python311-dmidecode-3.12.3-4.3.aarch64.rpm"
RPM_HASH = "81547fe9932e61859f31bc991f9395f5cead2ac1b98245d3bf3c7d86abc0568b87b06106c3e7f4e4833eb17a7908367f490238d46857d7af094f15eebec59ab4"

RPROVIDES:${PN} += "python3-dmidecode \
python3.11dist-python-dmidecode \
python311-dmidecode \
python3dist-python-dmidecode"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxml2mod.cpython-311-aarch64-linux-gnu.so \
python-abi \
python311 \
update-alternatives"

inherit rpm
