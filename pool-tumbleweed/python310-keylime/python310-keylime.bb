SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "python310-keylime-7.3.0-1.1.noarch.rpm"
RPM_HASH = "c9ce8752cc539ff634cd8f848bb2f1433a1162126cdea919627e40d0d9fec534c7d5afac3e4e115801a9a2528b8e3760042bea2601c238f40576b5e3188d4266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-keylime \
python310-keylime \
python3dist-keylime"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
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
