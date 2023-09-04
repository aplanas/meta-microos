SUMMARY = "Monitor and control user input devices"
DESCRIPTION = "Monitor and control user input devices"
LICENSE = "LGPL-3.0-only"

PV = "1.7.6"

RPM_NAME = "python310-pynput-1.7.6-3.1.noarch.rpm"
RPM_HASH = "971a244716008f35ffa2d8c268f68b0852f8872ea99aa954617028f446ad522c872c9ddf24722248c10b10dd18e9c3001d95e8d84a8db6a3aba660055328d7b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pynput \
python310-pynput \
python3dist-pynput"

RDEPENDS:${PN} += "python-abi \
python310-evdev \
python310-six"

inherit rpm
