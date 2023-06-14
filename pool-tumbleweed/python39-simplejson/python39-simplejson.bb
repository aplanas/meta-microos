SUMMARY = "Extensible JSON encoder/decoder for Python"
DESCRIPTION = "simplejson is an extensible JSON encoder and decoder for Python 2.5+. It is \
pure Python code with no dependencies, but includes an optional C extension for \
a speed boost."
LICENSE = "AFL-2.1 | MIT"

PV = "3.19.1"

RPM_NAME = "python39-simplejson-3.19.1-1.1.aarch64.rpm"
RPM_HASH = "b63796bcb73e27efc620dd42678da397610efd62fd2f202ea9e74c4870e481e72bc11ab11efc4a60ccf0305e91135774db000dad87bb90584eddd358bebb1bda"

RPROVIDES:${PN} += "python3.9dist-simplejson \
python39-simplejson \
python3dist-simplejson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
