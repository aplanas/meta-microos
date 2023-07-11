SUMMARY = "Create and sign CAs and certificates"
DESCRIPTION = "Create and sign CAs and certificates."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python310-certipy-0.1.3-2.13.noarch.rpm"
RPM_HASH = "2fe78280d61bac1ea22514498fa4c4fcbea147a057c85b5622452a350affa9fdc6df0ded3ee208518b22d63f69ad469da24c6b751ad25f4244a18d132af33c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certipy \
python310-certipy \
python3dist-certipy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pyOpenSSL \
update-alternatives"

inherit rpm
