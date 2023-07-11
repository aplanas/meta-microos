SUMMARY = "Provide the best available JSON implementation available"
DESCRIPTION = "Anyjson loads whichever is the fastest JSON module installed and provides \
a uniform API regardless of which JSON implementation is used. \
 \
Originally part of carrot (https://github.com/ask/carrot/)"
LICENSE = "BSD-3-Clause"

PV = "0.3.3+git.1298315003.7bb1d18"

RPM_NAME = "python310-anyjson-0.3.3+git.1298315003.7bb1d18-2.5.noarch.rpm"
RPM_HASH = "509ba11cd74e3f767b06acda284c6cff77982bccddd3366d4d4c756e0012668c377af0a0408470bdf1a710debe8ce3ade2b87996a4a256c51f4360a0fb5a7c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-anyjson \
python310-anyjson \
python3dist-anyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
