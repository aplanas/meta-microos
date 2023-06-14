SUMMARY = "A tool for integrating Git with Patchwork"
DESCRIPTION = "git-pw is a tool for integrating Git with Patchwork, the web-based patch \
tracking system."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-git-pw-2.4.0-2.2.noarch.rpm"
RPM_HASH = "92dff10cca86acb77dfb529156ec821f36d5e978dff0143d90d9226e64f2f9ccbf8fcf85728b88c8cfb1d3ef62c5eacb359fd6fc792bb2c993efbe42d7b54c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-pw \
python3.9dist-git-pw \
python39-git-pw \
python3dist-git-pw"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
git-core \
python-abi \
python39-arrow \
python39-click \
python39-pyaml \
python39-requests \
python39-tabulate \
update-alternatives"

inherit rpm
