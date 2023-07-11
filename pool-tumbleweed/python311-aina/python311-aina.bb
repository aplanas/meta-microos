SUMMARY = "A general-purpose stream processing framework"
DESCRIPTION = "Aina is a general-purpose stream processing framework. It includes a \
templating system which powers a command line utility."
LICENSE = "GPL-3.0-only"

PV = "0.1.3"

RPM_NAME = "python311-aina-0.1.3-4.11.noarch.rpm"
RPM_HASH = "c817b554de8e2668dcf0bf56bf25d1b8600198727dd71a5626490adeedf6cc74275c25b4cf8bdd9d6957bf904b212e78a55ca11758c1ae7160508d38337d4985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aina \
python3.11dist-aina \
python311-aina \
python3dist-aina"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-base \
python311-click \
update-alternatives"

inherit rpm
