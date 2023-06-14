SUMMARY = "Flake8 lint for newline after class definitions"
DESCRIPTION = "Flake8 Extension to lint for a method newline after a Class definition"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-flake8-class-newline-1.6.0-2.8.noarch.rpm"
RPM_HASH = "96c18a931d8677f28740c17276e40f8f4e2a58acfc31649fb5857026ef5a798739776f32cec785c0aa09b5fa42a32e50837d7c3e35b6bbebba5ae277848be482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flake8-class-newline \
python311-flake8-class-newline \
python3dist-flake8-class-newline"

RDEPENDS:${PN} += "python-abi \
python311-flake8"

inherit rpm
