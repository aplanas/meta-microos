SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "python311-keylime-7.0.0-2.1.noarch.rpm"
RPM_HASH = "64296578fbdcc3b1480bf12151c26a0d6ffe9b34c98fd23d04fd8d79ea3a3309f75203538e72d0588111ead37b80f54630a81711e986099578de9446eda1010b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-keylime \
python311-keylime \
python3dist-keylime"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
