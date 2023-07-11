SUMMARY = "Abstraction over xpyb"
DESCRIPTION = "xpybutil is an abstraction over the X Python Binding (xpyb). It exists because xpyb is a very low level library that communicates with X."
LICENSE = "WTFPL"

PV = "0.0.6"

RPM_NAME = "python310-xpybutil-0.0.6-1.16.noarch.rpm"
RPM_HASH = "18c07db037f42aec1bcd882cc396991e8ef73f4112724d37f5d08ec6faa5e1f3c019bd34b71c48084c808ebf3845e094dab112257b16dc90699a522509279775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xpybutil \
python310-xpybutil \
python3dist-xpybutil"

RDEPENDS:${PN} += "python-abi \
python310-xcffib"

inherit rpm
