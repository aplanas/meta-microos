SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "python39-tools-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "09d93d661ec1cff589dbc3c583dbd15d54109bef67afd8b5aabe51bcd3fbe2dc054e0866c13535cae8a2c0604811dffa1677e61f4d1419fd704fa22a397a380d"

RPROVIDES:${PN} += "python39-2to3 \
python39-demo \
python39-tools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
python39-base"

inherit rpm
