SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.105"

RPM_NAME = "python39-copr-cli-1.105-2.6.noarch.rpm"
RPM_HASH = "245afd3164e62e57d992728c76f8bcf19b551b383b2365ffcca93b60a0a25647532c31a75067952cfbe32194cae536ecfcf2c10de9f36cf4f038f15819e2e726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-copr-cli \
python39-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
