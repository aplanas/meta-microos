SUMMARY = "A tool for integrating Git with Patchwork"
DESCRIPTION = "git-pw is a tool for integrating Git with Patchwork, the web-based patch \
tracking system."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-git-pw-2.4.0-2.4.noarch.rpm"
RPM_HASH = "f547aaa3e857983dd73860df90a60e2d43a70935598e1440763a3929667bd24bad35ec3c0c73ad5a0909f6736488c22846845bbbc7e272289ad333274759464a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-pw \
python3.10dist-git-pw \
python310-git-pw \
python3dist-git-pw"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
git-core \
python-abi \
python310-arrow \
python310-click \
python310-pyaml \
python310-requests \
python310-tabulate \
update-alternatives"

inherit rpm
