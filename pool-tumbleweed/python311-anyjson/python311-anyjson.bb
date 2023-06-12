SUMMARY = "Provide the best available JSON implementation available"
DESCRIPTION = "Anyjson loads whichever is the fastest JSON module installed and provides \
a uniform API regardless of which JSON implementation is used. \
 \
Originally part of carrot (https://github.com/ask/carrot/)"
LICENSE = "BSD-3-Clause"

PV = "0.3.3+git.1298315003.7bb1d18"

RPM_NAME = "python311-anyjson-0.3.3+git.1298315003.7bb1d18-2.3.noarch.rpm"
RPM_HASH = "3ec67455af41b55e70f673de9f9da62cb4afa7b19997f2b802a6a8e4c00250fe1687a003ec5261eb4025ddc2333a5abc8e7a595609c50dbb2536fe56316dfa97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(anyjson) \
python311-anyjson \
python3dist(anyjson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
