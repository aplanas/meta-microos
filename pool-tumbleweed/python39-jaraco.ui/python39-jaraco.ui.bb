SUMMARY = "User-Interface tools (mainly command-line)"
DESCRIPTION = "User-Interface tools (mainly command-line)"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-jaraco.ui-2.3.0-1.1.noarch.rpm"
RPM_HASH = "63afeeaa45150ad6909e91a309455f08919b1a7bbcb1ca140f84d4e0c290d1528780a9acb3bc3fcc74ad41a7750ac3b788479ad1f98a9f64b0a05f798e70d830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.ui \
python39-jaraco.ui \
python3dist-jaraco.ui"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.classes \
python39-jaraco.text"

inherit rpm
