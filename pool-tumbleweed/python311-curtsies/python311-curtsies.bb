SUMMARY = "Curses-like terminal wrapper, with colored strings!"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-curtsies-0.4.1-1.5.noarch.rpm"
RPM_HASH = "9b68665effbe1f7ce040f1509ff9c30a226e0b42fb763f4aca000a4ea42df4af9cc81d0a07a941af088e05d2b0a626f9eb80c264531a32183bfb77e5802c8717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-curtsies \
python3.11dist-curtsies \
python311-curtsies \
python3dist-curtsies"

RDEPENDS:${PN} += "python-abi \
python311-blessed \
python311-cwcwidth"

inherit rpm
