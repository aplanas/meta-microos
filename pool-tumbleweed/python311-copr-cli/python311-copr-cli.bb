SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.105"

RPM_NAME = "python311-copr-cli-1.105-2.6.noarch.rpm"
RPM_HASH = "fa9ef4efe4fe2123bcd3a01d95c2d41e9412e3a772b41edd363c6924d36c996b58654840006ef2187b26f34be8193b83f8d543aa9cede2e20778cfb47155e87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-copr-cli \
python3.11dist-copr-cli \
python311-copr-cli \
python3dist-copr-cli"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-copr \
python311-filelock \
python311-future \
python311-humanize \
python311-requests-gssapi \
python311-responses \
update-alternatives"

inherit rpm
