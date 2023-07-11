SUMMARY = "An interative animation framework for matplotlib"
DESCRIPTION = "An interative animation framework for matplotlib"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python310-mpl-animators-1.0.1-1.8.noarch.rpm"
RPM_HASH = "5e0e2ba8e82206c46951eaef2a45435f21c5df1d56de3d07f3c4121ba913f69b4422def03bef8836ed01ffe35b66773e8a4272f66ffafc6249bf7125fca3f0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mpl-animators \
python310-mpl-animators \
python3dist-mpl-animators"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy"

inherit rpm
