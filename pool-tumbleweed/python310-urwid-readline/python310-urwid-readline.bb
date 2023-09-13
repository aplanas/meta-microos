SUMMARY = "Text input widget for urwid that supports readline shortcuts"
DESCRIPTION = "Urwid-readline is a text input widget that supports readline shortcuts. Needed \
by many apps like pudb."
LICENSE = "MIT"

PV = "0.13"

RPM_NAME = "python310-urwid-readline-0.13-1.1.noarch.rpm"
RPM_HASH = "3b67932c39bcf9e523552369ec965485100707bbf4a0bd24d3db67cc3c8048f52c55efa29365565b60d99ad5b7edc78db2d63ba477233b120edd23deffb00e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-urwid-readline \
python310-urwid-readline \
python3dist-urwid-readline"

RDEPENDS:${PN} += "python-abi \
python310-urwid"

inherit rpm
