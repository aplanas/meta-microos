SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.105"

RPM_NAME = "python310-copr-cli-1.105-2.6.noarch.rpm"
RPM_HASH = "41b3b44563be4010c1b84b8aa36a00ef06d138e56609c7eeebb74ebd86ced533bc601212fa03a7fd072502c1c91716a48e9b5a1b0d6db9564bfdf2573066c6be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-copr-cli \
python310-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
