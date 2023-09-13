SUMMARY = "Text input widget for urwid that supports readline shortcuts"
DESCRIPTION = "Urwid-readline is a text input widget that supports readline shortcuts. Needed \
by many apps like pudb."
LICENSE = "MIT"

PV = "0.13"

RPM_NAME = "python311-urwid-readline-0.13-1.1.noarch.rpm"
RPM_HASH = "8f55ce3ac8afd3a5b2acd74d8b9be9d7b7777630e55030fe470816a7600ae7525b32804e1a121c2b871ff37ee6a96cfd699b17c3c8f1d32f5a89f6c2607d5e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urwid-readline \
python3.11dist-urwid-readline \
python311-urwid-readline \
python3dist-urwid-readline"

RDEPENDS:${PN} += "python-abi \
python311-urwid"

inherit rpm
