SUMMARY = "Curses-like terminal wrapper, with colored strings!"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-curtsies-0.4.1-1.5.noarch.rpm"
RPM_HASH = "fc87ee0f643c27eabd17da7a78234db864037550dc5567e6ffd4cf5f95f4c66c0e7968a6970f055ae7fdc2e01c1dad1f450820e4d21cd957e0883f455325ff74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-curtsies \
python39-curtsies \
python3dist-curtsies"

RDEPENDS:${PN} += "python-abi \
python39-blessed \
python39-cwcwidth"

inherit rpm
