SUMMARY = "Pygments version of the 'railscasts' vim theme."
DESCRIPTION = "A port of the railscasts color scheme for pygments."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python39-pygments-style-railscasts-0.3-1.17.noarch.rpm"
RPM_HASH = "e867efacc6fcb6816e391f484555498afac2ac2c9e8a809ca734d949b257e2d6ef3991898332986c4d58373a6af26db2f62133f84146e436943e3a6abefdf83b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygments-style-railscasts \
python39-pygments-style-railscasts \
python3dist-pygments-style-railscasts"

RDEPENDS:${PN} += "python-abi \
python39-pygments"

inherit rpm
