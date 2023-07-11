SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "python39-keylime-7.2.5-1.3.noarch.rpm"
RPM_HASH = "ae2c91e0752f0a2650d2bd81490dd007d60c499b51469f8ca376f8dd98ee856f251a66963ed03fa09b9f11e4f67ef9838cba3758bd2b31b94a299b92e50c4c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-keylime \
python39-keylime \
python3dist-keylime"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
libtss2-tcti-device0 \
libtss2-tcti-tabrmd0 \
procps \
python-abi \
python39-M2Crypto \
python39-PyYAML \
python39-SQLAlchemy \
python39-alembic \
python39-cryptography \
python39-gpg \
python39-jsonschema \
python39-lark \
python39-psutil \
python39-pyzmq \
python39-requests \
python39-tornado \
python39-typing-extensions \
tpm2-0-tss \
tpm2.0-abrmd \
tpm2.0-tools \
update-alternatives"

inherit rpm
