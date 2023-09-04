SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "python310-keylime-7.4.0-1.1.noarch.rpm"
RPM_HASH = "1ad8db5304b6d9655dd66495df0652d36f8eaf8892187663f392777b93b0c8a9d920270ffcd25c7577830b22373daf144192def7a1701bc88110191861f88952"
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
