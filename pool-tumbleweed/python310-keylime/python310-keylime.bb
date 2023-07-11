SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.2.5"

RPM_NAME = "python310-keylime-7.2.5-1.3.noarch.rpm"
RPM_HASH = "1332639f08e44811d3d1b68a6ae41aa35e10129e73ea708bebe8e3160591041dd7107b4ca2f807920b9f710322f282450cbe510fd209a4236d30bd62357cfdec"
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
python310-M2Crypto \
python310-PyYAML \
python310-SQLAlchemy \
python310-alembic \
python310-cryptography \
python310-gpg \
python310-jsonschema \
python310-lark \
python310-psutil \
python310-pyzmq \
python310-requests \
python310-tornado \
python310-typing-extensions \
tpm2-0-tss \
tpm2.0-abrmd \
tpm2.0-tools \
update-alternatives"

inherit rpm
