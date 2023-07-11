SUMMARY = "Python library for building OAuth and OpenID Connect servers"
DESCRIPTION = "A Python library for building OAuth and OpenID Connect servers."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-Authlib-1.2.1-1.1.noarch.rpm"
RPM_HASH = "c45bbeb31250fc1512d04c31a2697a356e677de35dafc8a1bac0814d29ce19b411aa1bb8747e70504640dddde7dba621f1e83607b8167e04b3214da836c92761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-authlib \
python310-Authlib \
python3dist-authlib"

RDEPENDS:${PN} += "python-abi \
python310-cryptography"

inherit rpm
