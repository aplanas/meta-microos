SUMMARY = "Setuptools gettext extension plugin"
DESCRIPTION = "Setuptools gettext extension plugin"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "python39-setuptools-gettext-0.1.1-2.3.noarch.rpm"
RPM_HASH = "2fc43db97b77827a4e64f75a294b71261881302b403879aec909663f8f7bc433b13117a9586030f1c9a37b6acdb8c6a4eeef5be1e6902c2be2df24cfc5303720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-gettext \
python39-setuptools-gettext \
python3dist-setuptools-gettext"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
