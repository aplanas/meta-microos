SUMMARY = "Python library to return the first true value of an iterable"
DESCRIPTION = "A Python library that returns the first true value of an iterable."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-first-2.0.2-4.5.noarch.rpm"
RPM_HASH = "8f39be9d76fca5d10885b61d9c3e9b7352870c6cea1bd5cf61e44c92ad0bcbe5abed062e45de2f01a78d625ab15b7df74eba8f0739c131aa8596f0a6531c908b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-first \
python3.11dist-first \
python311-first \
python3dist-first"

RDEPENDS:${PN} += "python-abi"

inherit rpm
