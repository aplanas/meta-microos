SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.4"

RPM_NAME = "python310-virtue-2023.7.4-1.1.noarch.rpm"
RPM_HASH = "2b0b177c3995379a4bf6882988b0fb91f9aa0abc668fc3909e849e854d803e4bc7fcbf2944c5e6cf0de7d0c7886ae508ff38d5ccaabaaca3e3e08d7df73d5aca"
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
