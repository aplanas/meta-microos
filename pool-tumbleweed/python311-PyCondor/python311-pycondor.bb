SUMMARY = "Python utility for HTCondor"
DESCRIPTION = "PyCondor (Python HTCondor) is a tool to help build and submit workflows to HTCondor in a straight-forward manner with minimal hassle."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-PyCondor-0.6.0-1.4.noarch.rpm"
RPM_HASH = "2c680a65fcbd7314d0a40896b8aacefd2c70ba95dbf9836c8ca54a27201e54429858d911e35eb1a473a79191e93d2442ae6077ca6a2f3c9d821896fd33f77dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pycondor) \
python311-PyCondor \
python3dist(pycondor)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
