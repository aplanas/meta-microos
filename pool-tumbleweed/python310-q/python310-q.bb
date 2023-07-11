SUMMARY = "Quick-and-dirty debugging output for tired programmers"
DESCRIPTION = "Quick-and-dirty debugging output for tired programmers."
LICENSE = "Apache-2.0"

PV = "2.7"

RPM_NAME = "python310-q-2.7-1.4.noarch.rpm"
RPM_HASH = "e39380d6dd0bb794838b3ff12eab798ca6217b5379bcb42306a471bb479ea9b20967104b8f68ffe4c9e05261a222c81abfe407e51255847796fc69bf6d18684c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-q \
python310-q \
python3dist-q"

RDEPENDS:${PN} += "python-abi"

inherit rpm
