SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "python311-keylime-7.5.0-1.1.noarch.rpm"
RPM_HASH = "b8c6dd5f9cd38135254cf7e277cdb8aa0a74220f3323bd8bdb4c55a55cc3f0216326af05f5216336eb595147c69a4d9a9e9a5ce956b11efc564a18ed01e45502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keylime \
python3.11dist-keylime \
python311-keylime \
python3dist-keylime"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
libtss2-tcti-device0 \
libtss2-tcti-tabrmd0 \
procps \
python-abi \
python3-M2Crypto \
python3-PyYAML \
python3-SQLAlchemy \
python3-alembic \
python3-cryptography \
python3-gpg \
python3-jsonschema \
python3-lark \
python3-packaging \
python3-psutil \
python3-pyzmq \
python3-requests \
python3-tornado \
python3-typing-extensions \
tpm2-0-tss \
tpm2.0-abrmd \
tpm2.0-tools \
update-alternatives"

inherit rpm
