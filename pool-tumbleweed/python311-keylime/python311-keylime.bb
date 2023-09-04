SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "python311-keylime-7.4.0-1.1.noarch.rpm"
RPM_HASH = "5a03f3341619648b4288e1bf99b4770c703b906eb8777348ea4df09ecde7ff15cae54696eed9b0661705db0418f94f88945668872a2bb5af46b02b3af9d8e86f"
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
