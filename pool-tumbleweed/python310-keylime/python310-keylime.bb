SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.5.0"

RPM_NAME = "python310-keylime-7.5.0-1.1.noarch.rpm"
RPM_HASH = "86680bba372efeb0a5c6b45c863e521896b1e39c6594c699ce09d132a837d0df7c4e0deed912b80067de1fa3f18182e7c590a38fe54db292c19a4eacf646bf48"
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
