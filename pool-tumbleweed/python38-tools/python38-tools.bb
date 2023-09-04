SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-tools-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "a690f3ea2cd99faf62a16daa84756727aed7ffc48aaa28cfd20cb95c9e4479d0202d7ec8eb77c96c92bd0fab57012adf99d40c94df06e1f9ee820fdc2aab247b"

RPROVIDES:${PN} += "python38-2to3 \
python38-demo \
python38-tools"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
python-abi \
python38-base"

inherit rpm
