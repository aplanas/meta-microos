SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.4.0"

RPM_NAME = "python39-keylime-7.4.0-1.1.noarch.rpm"
RPM_HASH = "df2a4da4d1027d00ddd0bd6722a7b8e5d4cab41fe4a8bfe57bba6a5562bb2883e2d7fee78746ddd0787dcd942c5be636c8da41c50824cd6a1c2df47ae3b158bf"
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
