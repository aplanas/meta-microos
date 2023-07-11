SUMMARY = "Module to parse and manipulate version numbers"
DESCRIPTION = "parver allows parsing and manipulation of `PEP 440`_ version numbers."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-parver-0.4-1.4.noarch.rpm"
RPM_HASH = "fd6b49205f5ffbe04b6fa5f3d00c82c02c27228a603371c782971ccc1b0c5073a9889af464289e86bae7a15b70ca70ae85242aa3aa4d8634f619b783917b6ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parver \
python310-parver \
python3dist-parver"

RDEPENDS:${PN} += "python-abi \
python310-Arpeggio \
python310-attrs \
python310-typing-extensions"

inherit rpm
