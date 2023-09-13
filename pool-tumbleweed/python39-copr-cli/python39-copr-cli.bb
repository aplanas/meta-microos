SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.110"

RPM_NAME = "python39-copr-cli-1.110-1.1.noarch.rpm"
RPM_HASH = "296642a7ba422431a3ec51a354ff8733805fe80f6efe076f90af408704f39d090e804a2c90f0946e0a0f0e6b8b458ad138147a5429f0c3364c2e0ac887814f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-copr-cli \
python39-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-copr \
python39-humanize \
python39-setuptools \
update-alternatives"

inherit rpm
