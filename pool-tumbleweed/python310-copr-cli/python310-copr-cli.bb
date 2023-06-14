SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.105"

RPM_NAME = "python310-copr-cli-1.105-2.4.noarch.rpm"
RPM_HASH = "3ba73077b149e0782b81d146422a5a3760715a6a2e0ea77c885361369e2e18166925d097596931cd2dc9f8b4025e8f7c72dbfec28d6d3d02819264cb1813e5be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-copr-cli \
python3.10dist-copr-cli \
python310-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Jinja2 \
python310-copr \
python310-filelock \
python310-future \
python310-humanize \
python310-requests-gssapi \
python310-responses \
update-alternatives"

inherit rpm
