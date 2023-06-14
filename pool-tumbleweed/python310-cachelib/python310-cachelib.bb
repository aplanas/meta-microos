SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python310-cachelib-0.10.2-2.1.noarch.rpm"
RPM_HASH = "ae975ad702b7563a6183d5f9ebf32b55acd1c6bc08211ff803a51a6281139d1cf01ebfa65fef86e0ab10880022fc98ac3339a9f8eddd507d7288365ca743585e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachelib \
python3.10dist-cachelib \
python310-cachelib \
python3dist-cachelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
