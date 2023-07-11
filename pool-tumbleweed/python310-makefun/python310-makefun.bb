SUMMARY = "Small library to dynamically create python functions"
DESCRIPTION = "Small library to dynamically create python functions."
LICENSE = "BSD-3-Clause"

PV = "1.15.1"

RPM_NAME = "python310-makefun-1.15.1-2.4.noarch.rpm"
RPM_HASH = "ae76a02efcb617543a4bfa10f1060a2b1c56f56b0f09f772d03eac87c7d9935ced29c9528f3f17db13b2354954d09db32c31a903c0d0257500765aa805734d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-makefun \
python310-makefun \
python3dist-makefun"

RDEPENDS:${PN} += "python-abi"

inherit rpm
