SUMMARY = "A library for creating wrappers around web APIs"
DESCRIPTION = "Wrapping web APIs made easy. \
A tiny library for creating wrappers around web APIs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-tortilla-0.5.0-1.14.noarch.rpm"
RPM_HASH = "709ace59cc1140491dfb6d7d12c3dd70b267874a73c787281c81959a2962f2f5201869d827a4f465c509ccd2893ef7cef380975b3e5ac32bf71a9d12d93c2377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-tortilla \
python311-tortilla \
python3dist-tortilla"

RDEPENDS:${PN} += "python-abi \
python311-colorama \
python311-formats \
python311-httpretty \
python311-requests \
python311-six"

inherit rpm
