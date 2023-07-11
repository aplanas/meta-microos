SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python311-jaraco.context-4.3.0-1.3.noarch.rpm"
RPM_HASH = "c2eb29af43d71be27f715c37aaad7fb07816f65bf8d73af25b598c84ed747e6d8753d0896525f1bb8258dcf7f113f808d225ffcb1713058f5ec04041c17d712c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.context \
python3.11dist-jaraco.context \
python311-jaraco.context \
python3dist-jaraco.context"

RDEPENDS:${PN} += "python-abi"

inherit rpm
