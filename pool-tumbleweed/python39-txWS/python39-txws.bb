SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python39-txWS-0.9.1-4.2.noarch.rpm"
RPM_HASH = "40f334d7f40a0de3f37c589f8800c0b449bda89575a31e7b4446900dacc9af9cfdbfba92adca2ac1a00719dae2e5cf232276280d6e1673574419e8e3e9ee45e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-txws \
python39-txWS \
python3dist-txws"

RDEPENDS:${PN} += "python-abi \
python39-Twisted"

inherit rpm
