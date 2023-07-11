SUMMARY = "Python3 support for libcaca"
DESCRIPTION = "This package contains all that is needed to use libcaca from python3."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "python3-caca-0.99.beta20-1.5.noarch.rpm"
RPM_HASH = "b766d1bc245bb005361c2237181d7698e14703b4ea353f94429c6df924713e9185243e2be0254f6d08cb431800bdd1c2603d4aad764e1a040dc00ed041280706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-caca"

RDEPENDS:${PN} += "libcaca \
python-abi"

inherit rpm
