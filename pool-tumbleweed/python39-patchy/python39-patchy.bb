SUMMARY = "Patch the inner source of python functions at runtime"
DESCRIPTION = "Patch the inner source of python functions at runtime."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python39-patchy-2.6.0-1.3.noarch.rpm"
RPM_HASH = "872d0c792ce8eafe8fb8a3517ec7d7a5e0729458d9e6437383b9876b83ce3495060ab2fe5f9805672da114acaed566f196972018e940bdb9c96087a30b11dad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(patchy) \
python39-patchy \
python3dist(patchy)"

RDEPENDS:${PN} += "python(abi) \
python39-pkgutil-resolve-name"

inherit rpm
