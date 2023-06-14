SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.105"

RPM_NAME = "python39-copr-cli-1.105-2.4.noarch.rpm"
RPM_HASH = "8dd2817832d8c515a9daa28a99c6d8c14e5b71d544aa58932ce9f4c97382a3c693320f4991cbcffcbefd5d55c9d9bb4d2a8d37cb365b8b3a83f734bcba2c2bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-copr-cli \
python39-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Jinja2 \
python39-copr \
python39-filelock \
python39-future \
python39-humanize \
python39-requests-gssapi \
python39-responses \
update-alternatives"

inherit rpm
