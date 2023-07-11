SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python39-flup-1.0.3.dev20161029-3.2.noarch.rpm"
RPM_HASH = "0b95ffc1af1cb71b343ab39490ac10a509a4df03a9e0f5d298f3f9f003f7ab438e9eab9ea34b41a26b337fea6df43315ae221ed5f911690398ea0e82a7b9e812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flup \
python39-flup \
python3dist-flup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
