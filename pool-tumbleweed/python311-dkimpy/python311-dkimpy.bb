SUMMARY = "DKIM (DomainKeys Identified Mail)"
DESCRIPTION = "DKIM (DomainKeys Identified Mail)"
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python311-dkimpy-1.0.5-1.12.noarch.rpm"
RPM_HASH = "53f62c8fc4918416efb31f8f401bafba27a13eee5c79d2b1d34cea828f9f557a218216f1e56b0898081bcc8bb0a7de30b1c50ae4b3449d89ab111fa98dc79779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dkimpy \
python311-dkimpy \
python3dist-dkimpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PyNaCl \
python311-authres \
python311-dnspython \
python311-setuptools \
update-alternatives"

inherit rpm
