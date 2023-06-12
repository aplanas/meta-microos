SUMMARY = "Setuptools gettext extension plugin"
DESCRIPTION = "Setuptools gettext extension plugin"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "python310-setuptools-gettext-0.1.1-1.3.noarch.rpm"
RPM_HASH = "898493b4bf52943fd97adad12042379959ec29e32b3b633593015a1925e58940531aa247f6c23cb12a16499d1cbed49f680cca3997c6178f7f986d189a5d4177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-gettext \
python3.10dist(setuptools-gettext) \
python310-setuptools-gettext \
python3dist(setuptools-gettext)"
RDEPENDS:${PN} += "python(abi) \
python310-setuptools"

inherit rpm
