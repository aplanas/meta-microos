SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.8.2"

RPM_NAME = "python311-virtue-2023.8.2-1.1.noarch.rpm"
RPM_HASH = "380ca89d6464c6c819c5e580477f52f9694d2298210ed6dd0f140fe997b42ffe820d247fbd4be20ad349d7a6c3d0521e53b3441d1963ee69ca9599ef7107e370"
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
