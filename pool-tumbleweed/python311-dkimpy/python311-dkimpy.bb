SUMMARY = "DKIM (DomainKeys Identified Mail)"
DESCRIPTION = "DKIM (DomainKeys Identified Mail)"
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python311-dkimpy-1.0.5-2.1.noarch.rpm"
RPM_HASH = "47dcd0b0aa7929eb1c4d824494c16d59ed40951f32a945f2aa4ddad9871c4d1c16c5ddb147077358e0d2b133ac62e90a811034a74a5cb610a4c17a4704d5484b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dkimpy \
python3.11dist-dkimpy \
python311-dkimpy \
python3dist-dkimpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyNaCl \
python311-authres \
python311-dnspython \
python311-setuptools \
update-alternatives"

inherit rpm
