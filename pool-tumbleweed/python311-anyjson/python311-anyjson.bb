SUMMARY = "Provide the best available JSON implementation available"
DESCRIPTION = "Anyjson loads whichever is the fastest JSON module installed and provides \
a uniform API regardless of which JSON implementation is used. \
 \
Originally part of carrot (https://github.com/ask/carrot/)"
LICENSE = "BSD-3-Clause"

PV = "0.3.3+git.1298315003.7bb1d18"

RPM_NAME = "python311-anyjson-0.3.3+git.1298315003.7bb1d18-2.5.noarch.rpm"
RPM_HASH = "377a2edcf50f8b01e5dcaa5ff645e7009e4f26e84733a7f62d239086f4f5a67c9db727c9662a17412673c661d6a519144e9996a7262365e2f04dadab422fb0e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyjson \
python3.11dist-anyjson \
python311-anyjson \
python3dist-anyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
