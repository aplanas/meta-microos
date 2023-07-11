SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.5.3"

RPM_NAME = "python311-virtue-2023.5.3-1.3.noarch.rpm"
RPM_HASH = "9b71c8bea78110b55b4a6237ab9daf6916b7e373d64e8418288c16b021185bf98e9143d2ff8aeb840d6fd8b39a8f4bbba4033b9b26f24c195c64a121bd7ce882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtue \
python3.11dist-virtue \
python311-virtue \
python3dist-virtue"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Twisted \
python311-attrs \
python311-click \
python311-colorama \
python311-pyrsistent \
update-alternatives"

inherit rpm
