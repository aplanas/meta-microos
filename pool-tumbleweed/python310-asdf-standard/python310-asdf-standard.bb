SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-asdf-standard-1.0.3-1.5.noarch.rpm"
RPM_HASH = "328040a80c205705238474ee464216eba87d77c43c8c1bfb93727238f7e170d91b5c6971105222fe938da774ba65086840d1e31e1cd249192cd159a533adaa30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf-standard \
python310-asdf-standard \
python3dist-asdf-standard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
