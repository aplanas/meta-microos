SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.110"

RPM_NAME = "python310-copr-cli-1.110-1.1.noarch.rpm"
RPM_HASH = "7f32c97f75befed6f25a0ce4008a2cb6df681eb216feb897f89c113fd45451fa49d5f9425f6c063a9eb5d42844e42904dd125f8c9234763f9b27833c3ea03228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-copr-cli \
python310-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-copr \
python310-humanize \
python310-setuptools \
update-alternatives"

inherit rpm
