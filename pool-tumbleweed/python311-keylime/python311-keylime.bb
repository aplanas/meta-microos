SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "python311-keylime-7.2.5-1.3.noarch.rpm"
RPM_HASH = "2b2155368c6e7afc019e6830bee919a0ff4f345c56d0f2ec709b9316704379b99e86dc417a66fc505c92c2862c1b221427fde52a3bb322b135f50f8a365ac6ff"
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
python311-M2Crypto \
python311-PyYAML \
python311-SQLAlchemy \
python311-alembic \
python311-cryptography \
python311-gpg \
python311-jsonschema \
python311-lark \
python311-psutil \
python311-pyzmq \
python311-requests \
python311-tornado \
python311-typing-extensions \
tpm2-0-tss \
tpm2.0-abrmd \
tpm2.0-tools \
update-alternatives"

inherit rpm
