SUMMARY = "Python utility for HTCondor"
DESCRIPTION = "PyCondor (Python HTCondor) is a tool to help build and submit workflows to HTCondor in a straight-forward manner with minimal hassle."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-PyCondor-0.6.0-1.6.noarch.rpm"
RPM_HASH = "5856c2e187cba7d0853e6320a9ac8c0763e574984c159239a2ac9ebb910d00b0a13457227136fd8716202ce674369028c382e1ea51a34c88a7e98a83d72c602c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyCondor \
python3.11dist-pycondor \
python311-PyCondor \
python3dist-pycondor"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
