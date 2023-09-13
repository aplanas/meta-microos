SUMMARY = "Text input widget for urwid that supports readline shortcuts"
DESCRIPTION = "Urwid-readline is a text input widget that supports readline shortcuts. Needed \
by many apps like pudb."
LICENSE = "MIT"

PV = "0.13"

RPM_NAME = "python39-urwid-readline-0.13-1.1.noarch.rpm"
RPM_HASH = "34f71863422a5a1071c0fca4a760dc2990af1a4f2251e2ab834fc961d960b936c966116fe2c1a43b23df3423ee5b29602fe7f3dd9397a33f194434bd7d406189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-urwid-readline \
python39-urwid-readline \
python3dist-urwid-readline"

RDEPENDS:${PN} += "python-abi \
python39-urwid"

inherit rpm
