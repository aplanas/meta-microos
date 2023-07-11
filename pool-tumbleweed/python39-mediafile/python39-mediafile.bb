SUMMARY = "Handles low-level interfacing for files' tags Wraps Mutagen to"
DESCRIPTION = "Handles low-level interfacing for files' tags. Wraps Mutagen to"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-mediafile-0.11.0-2.3.noarch.rpm"
RPM_HASH = "bb8338bc5a834a3b125bf671419dd931eaa945964955990b72677ab9cc0c85a654f1bae56e183f7769f929f15f32f98156f2c91c6781b5a14de2f80b73fc4bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mediafile \
python39-mediafile \
python3dist-mediafile"

RDEPENDS:${PN} += "python-abi \
python39-mutagen"

inherit rpm
