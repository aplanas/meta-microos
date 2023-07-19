SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "python311-keylime-7.3.0-1.1.noarch.rpm"
RPM_HASH = "60c3e76648a0b0203f8ce15e65c056020393ac8802ea123ca8bc3f9fe05cc5210517c14326129b711be12cb610d93925fee6a54c06f01c54be7c1e6a0d365a78"
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
