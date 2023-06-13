SUMMARY = "Pure-Python RSA Implementation"
DESCRIPTION = "Python-RSA is a pure-Python RSA implementation. It supports encryption and \
decryption, signing and verifying signatures, and key generation according to \
PKCS#1 version 1.5."
LICENSE = "Apache-2.0"

PV = "4.9"

RPM_NAME = "python39-rsa-4.9-2.1.noarch.rpm"
RPM_HASH = "2018a764a2a48207b87d80e7fcbdb15d9b538677ab97d00e2f7adc8a8e5006c0f532eb8c191414603f9d8dfcf06fa2e1d3a55e9450821561657dd0f6ec2f8928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rsa) \
python39-rsa \
python3dist(rsa)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
coreutils \
python(abi) \
python39-pyasn1"

inherit rpm
