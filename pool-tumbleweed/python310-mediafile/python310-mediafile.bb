SUMMARY = "Handles low-level interfacing for files' tags Wraps Mutagen to"
DESCRIPTION = "Handles low-level interfacing for files' tags. Wraps Mutagen to"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-mediafile-0.11.0-2.3.noarch.rpm"
RPM_HASH = "80da37b176edc50e213f26e4609506db4fd940930ee2e711ce88c898fa071769f006b4f5c8f65f1f8613b9e74b38664c4455ace79670ee9a4fab69253a22855b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mediafile \
python310-mediafile \
python3dist-mediafile"

RDEPENDS:${PN} += "python-abi \
python310-mutagen"

inherit rpm
