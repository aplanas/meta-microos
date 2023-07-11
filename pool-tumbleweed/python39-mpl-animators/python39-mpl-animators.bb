SUMMARY = "An interative animation framework for matplotlib"
DESCRIPTION = "An interative animation framework for matplotlib"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python39-mpl-animators-1.0.1-1.8.noarch.rpm"
RPM_HASH = "e3b3eb9b6f52705f7def988881cbe1f6eb21633b9fed6a0dd1a77ffa5b2b19e4f5ef9ada52aebe28a1bff6791bb40f54aa62db00d2f4beef2f0fd2f7c2a40269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mpl-animators \
python39-mpl-animators \
python3dist-mpl-animators"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy"

inherit rpm
