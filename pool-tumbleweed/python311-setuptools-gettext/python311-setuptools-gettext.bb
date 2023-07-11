SUMMARY = "Setuptools gettext extension plugin"
DESCRIPTION = "Setuptools gettext extension plugin"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "python311-setuptools-gettext-0.1.1-2.3.noarch.rpm"
RPM_HASH = "412221528a3282f1cc0b6143ee10f2b11162c7712886ff12b392a0d660a6cdba817cb4af447edc780e5276d5e10129affac48605b0c838b91a7e43800eb7ee29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-gettext \
python3.11dist-setuptools-gettext \
python311-setuptools-gettext \
python3dist-setuptools-gettext"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
