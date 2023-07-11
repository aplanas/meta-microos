SUMMARY = "Module to parse and manipulate version numbers"
DESCRIPTION = "parver allows parsing and manipulation of `PEP 440`_ version numbers."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-parver-0.4-1.4.noarch.rpm"
RPM_HASH = "05d15868de8eb2176fea8cc53abecff168226053327a8f92f21f93a67db59ec191f8c98edd4ceb492d120a982317d50fb482f31f2b6c98e7641095a7a82d46dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parver \
python39-parver \
python3dist-parver"

RDEPENDS:${PN} += "python-abi \
python39-Arpeggio \
python39-attrs \
python39-typing-extensions"

inherit rpm
