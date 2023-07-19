SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "python39-keylime-7.3.0-1.1.noarch.rpm"
RPM_HASH = "540e38411c579e8de0ccdf4a76feb80bcb481ee5816e9ee39641f3bbb3515c947d33493bc3b89d154d9bc4e24ed49f25a2f3fb77b6bdcbd37af61d5349f4339e"
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
