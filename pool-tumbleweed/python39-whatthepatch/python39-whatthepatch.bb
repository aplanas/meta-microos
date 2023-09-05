SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python39-whatthepatch-1.0.5-1.1.noarch.rpm"
RPM_HASH = "8999f730534202685cad77b102170d7beac3f60572bcdfbd1bc735261a937246f3ab30fe25a35da6ee6e5381670318de8c2dd373fe1f24b2b0285674983d7b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whatthepatch \
python39-whatthepatch \
python3dist-whatthepatch"

RDEPENDS:${PN} += "ed \
patch \
python-abi"

inherit rpm
