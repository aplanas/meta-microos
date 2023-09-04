SUMMARY = "Monitor and control user input devices"
DESCRIPTION = "Monitor and control user input devices"
LICENSE = "LGPL-3.0-only"

PV = "1.7.6"

RPM_NAME = "python39-pynput-1.7.6-3.1.noarch.rpm"
RPM_HASH = "fa321b3f1b3aa573925b4455f7bd0fa860273b2cb1c6fbfeefe8dfd12c22d1b8652a340d4714534673ca76aa788afbabcaae47fa22e9a0d5b6487abc6e4e081b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynput \
python39-pynput \
python3dist-pynput"

RDEPENDS:${PN} += "python-abi \
python39-evdev \
python39-six"

inherit rpm
