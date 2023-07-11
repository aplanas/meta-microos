SUMMARY = "Python currency and money classes"
DESCRIPTION = "Provides Currency and Money classes for use in your Python code."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python39-py-moneyed-3.0-1.5.noarch.rpm"
RPM_HASH = "32efe8ef3aa6085cd5c3a339e6579340814ed0e3a3903d47706c373abf716c5ca249efe92d1cfd61daf8911ba729bb4da816414f513ca920ab454ea3cefb8b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py-moneyed \
python39-py-moneyed \
python3dist-py-moneyed"

RDEPENDS:${PN} += "python-abi \
python39-Babel \
python39-typing-extensions"

inherit rpm
