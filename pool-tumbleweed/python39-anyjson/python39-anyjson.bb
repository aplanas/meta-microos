SUMMARY = "Provide the best available JSON implementation available"
DESCRIPTION = "Anyjson loads whichever is the fastest JSON module installed and provides \
a uniform API regardless of which JSON implementation is used. \
 \
Originally part of carrot (https://github.com/ask/carrot/)"
LICENSE = "BSD-3-Clause"

PV = "0.3.3+git.1298315003.7bb1d18"

RPM_NAME = "python39-anyjson-0.3.3+git.1298315003.7bb1d18-2.5.noarch.rpm"
RPM_HASH = "f3ca505560d95d5eb8bd4613bb3094d5f90719f21b1e598b08140e2335c26ef8e25d163780a0fdca63c070d4f419f0af3f30f0f955704c1a642be71fc3036ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-anyjson \
python39-anyjson \
python3dist-anyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
