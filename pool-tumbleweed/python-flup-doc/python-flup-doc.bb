SUMMARY = "Documentation for python-flup"
DESCRIPTION = "This package contains HTML documentation for python-flup."
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python-flup-doc-1.0.3.dev20161029-3.2.noarch.rpm"
RPM_HASH = "491828858f6d9831a49e5ecd140d80b4d3b127960224fc616a8291e3c8d1d14a479918eac90cac7db99fa1ac4ee13339d2188dd855bf5577b5be72d409c2fcb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-flup-doc \
python310-flup-doc \
python311-flup-doc \
python39-flup-doc"

RDEPENDS:${PN} += ""

inherit rpm
