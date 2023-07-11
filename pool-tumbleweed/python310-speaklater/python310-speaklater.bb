SUMMARY = "Implements a lazy string for python useful for use with gettext"
DESCRIPTION = "A module that provides lazy strings for translations.  Basically you \
get an object that appears to be a string but changes the value every \
time the value is evaluated based on a callable you provide."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "python310-speaklater-1.3-2.16.noarch.rpm"
RPM_HASH = "22f83d0cb8b9b696f7b0af3d98a0f1709affdd0cc53cbaa18ceb9e322f454127d9550b0f30abe1c1c9725d438be249e5a07f1be87069cbace19798660ca964e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-speaklater \
python310-speaklater \
python3dist-speaklater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
