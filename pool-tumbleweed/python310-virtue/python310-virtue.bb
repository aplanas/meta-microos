SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.5"

RPM_NAME = "python310-virtue-2023.7.5-1.1.noarch.rpm"
RPM_HASH = "e42b72599b8a8a7ee1ff00fadf1d07ad04930987795dc0f820d7dd53129d57b28883a05c34461c9825808d439faec259c3bc93551b70d24a2fddfddd44738606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-virtue \
python310-virtue \
python3dist-virtue"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Twisted \
python310-attrs \
python310-click \
python310-colorama \
python310-pyrsistent \
update-alternatives"

inherit rpm
