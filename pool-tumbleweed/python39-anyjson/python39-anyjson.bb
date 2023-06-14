SUMMARY = "Provide the best available JSON implementation available"
DESCRIPTION = "Anyjson loads whichever is the fastest JSON module installed and provides \
a uniform API regardless of which JSON implementation is used. \
 \
Originally part of carrot (https://github.com/ask/carrot/)"
LICENSE = "BSD-3-Clause"

PV = "0.3.3+git.1298315003.7bb1d18"

RPM_NAME = "python39-anyjson-0.3.3+git.1298315003.7bb1d18-2.3.noarch.rpm"
RPM_HASH = "938299a3acd0dca4c97b5eb26470fc7b857301871ea2aff4e10431fa9101cffb5162c10a7e9e11eea018553da59b80ca1266ed7d9cb35ffd2b10dee4a53fb54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-anyjson \
python39-anyjson \
python3dist-anyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
