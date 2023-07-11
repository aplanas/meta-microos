SUMMARY = "A variant of pprint that is arguably 'prettier'"
DESCRIPTION = "A drop-in replacement for pprint that is arguably prettier."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "python310-pprintpp-0.4.0-6.4.noarch.rpm"
RPM_HASH = "026c4246ef834fc6fc844c6add23a2314bdf77948c4e4d748dd8a773092e0fc09c93b67ca22bb8be83e3c34148d1012c714776547114deac02113c6e7cfdf932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pprintpp \
python310-pprintpp \
python3dist-pprintpp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
