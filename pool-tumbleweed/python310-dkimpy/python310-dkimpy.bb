SUMMARY = "DKIM (DomainKeys Identified Mail)"
DESCRIPTION = "DKIM (DomainKeys Identified Mail)"
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python310-dkimpy-1.0.5-1.12.noarch.rpm"
RPM_HASH = "9277b34e90a0ed3ff2e8e49557537b64ca4b2cbc6c359db91109101c124b10eccd2b92bec7a9d13b32e4b13dcf717273405ec860c8da9dc5846fe605819238ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dkimpy \
python3.10dist-dkimpy \
python310-dkimpy \
python3dist-dkimpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-PyNaCl \
python310-authres \
python310-dnspython \
python310-setuptools \
update-alternatives"

inherit rpm
