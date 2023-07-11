SUMMARY = "DKIM (DomainKeys Identified Mail)"
DESCRIPTION = "DKIM (DomainKeys Identified Mail)"
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python39-dkimpy-1.0.5-2.1.noarch.rpm"
RPM_HASH = "9e657207a05fa8262bc4891667ec556bc6eb9ad9e6e9538bc7188e6a238537e8a5477bad215d42a20e6bde6b55dc09c623e4f7a6d929019411b0b7c493eaa5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dkimpy \
python39-dkimpy \
python3dist-dkimpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyNaCl \
python39-authres \
python39-dnspython \
python39-setuptools \
update-alternatives"

inherit rpm
