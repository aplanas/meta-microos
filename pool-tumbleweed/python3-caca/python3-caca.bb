SUMMARY = "Python3 support for libcaca"
DESCRIPTION = "This package contains all that is needed to use libcaca from python3."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "python3-caca-0.99.beta20-1.4.noarch.rpm"
RPM_HASH = "698c5b3d03318235c39405ea42f110a5b9b78c9178f469753531c057eb93ee660f33bf68a4867627549c709513adcc050d8933924a8271bece105345f77c695c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-caca"

RDEPENDS:${PN} += "libcaca \
python(abi)"

inherit rpm
