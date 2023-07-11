SUMMARY = "DKIM (DomainKeys Identified Mail)"
DESCRIPTION = "DKIM (DomainKeys Identified Mail)"
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python310-dkimpy-1.0.5-2.1.noarch.rpm"
RPM_HASH = "224962e57d4dbd40e4ea7bd3aa1bdbd3197ebb0ae09541b346eddcc330b56dd233fd1930135f5898a11c65a80826fb39fc0283491f83df19eb685bb134e7afc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dkimpy \
python310-dkimpy \
python3dist-dkimpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyNaCl \
python310-authres \
python310-dnspython \
python310-setuptools \
update-alternatives"

inherit rpm
