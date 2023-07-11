SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-greenlet-devel-2.0.2-1.3.noarch.rpm"
RPM_HASH = "538a2e7c3209cbfa8734c06bda6ce7b16e17bdb9e71e0664fc6a913ed83423cd2fbacd242624e25603afda7fe7d1921b563073d6c4b4abb8802395810ca326e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-greenlet-devel"

RDEPENDS:${PN} += "python39-greenlet"

inherit rpm
