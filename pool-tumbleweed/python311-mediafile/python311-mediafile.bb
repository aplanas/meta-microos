SUMMARY = "Handles low-level interfacing for files' tags Wraps Mutagen to"
DESCRIPTION = "Handles low-level interfacing for files' tags. Wraps Mutagen to"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-mediafile-0.11.0-2.1.noarch.rpm"
RPM_HASH = "053490f3aab28fc0b5d6d4553c517006b0227001a63b1d8030b4459818ece4bf962e2ec9cc1168d76cbac848d13e5e708533f78a7cc1f6230818da18091bab58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mediafile) \
python311-mediafile \
python3dist(mediafile)"

RDEPENDS:${PN} += "python(abi) \
python311-mutagen"

inherit rpm
