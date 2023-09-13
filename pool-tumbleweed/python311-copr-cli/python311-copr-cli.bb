SUMMARY = "Copr cli"
DESCRIPTION = "CLI tool to run copr."
LICENSE = "GPL-2.0-or-later"

PV = "1.110"

RPM_NAME = "python311-copr-cli-1.110-1.1.noarch.rpm"
RPM_HASH = "483dafca02dd65f68c175990fc2f890ec79583dc02f0fb72ed9ab5b558695a81c46ab5e59563b4addc1f9f084288bc50860c1655434aa94df49860793440445e"
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
python311-humanize \
python311-setuptools \
update-alternatives"

inherit rpm
