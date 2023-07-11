SUMMARY = "Python module to access DMI data"
DESCRIPTION = "python-dmidecode is a python extension module that uses the code-base \
of the 'dmidecode' utility, and presents the data as python data \
structures or as XML data using libxml2."
LICENSE = "GPL-2.0-only"

PV = "3.12.3"

RPM_NAME = "python39-dmidecode-3.12.3-4.3.aarch64.rpm"
RPM_HASH = "fdd47d619285cb96e4ffce1de7529bb73afc4e25a7801cedf29e3ede6efd25adb27ed49ac5c9689c1849dd94c0ff9c02305468bb7fc874bb94ec3703432a5bb2"

RPROVIDES:${PN} += "python3.9dist-python-dmidecode \
python39-dmidecode \
python3dist-python-dmidecode"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxml2mod.cpython-39-aarch64-linux-gnu.so \
python-abi \
python39 \
update-alternatives"

inherit rpm
