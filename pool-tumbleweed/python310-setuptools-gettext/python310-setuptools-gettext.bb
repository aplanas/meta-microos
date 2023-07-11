SUMMARY = "Setuptools gettext extension plugin"
DESCRIPTION = "Setuptools gettext extension plugin"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "python310-setuptools-gettext-0.1.1-2.3.noarch.rpm"
RPM_HASH = "971ec289abb8ce9a80d75e463c4036d6517b42fc3638ce05ea5e1a5b979e67f738b774c4d0e3dda1eed19acbc24e76814f1e9c882dba1f162a5b4cf9b9797da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools-gettext \
python310-setuptools-gettext \
python3dist-setuptools-gettext"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
