SUMMARY = "A general-purpose stream processing framework"
DESCRIPTION = "Aina is a general-purpose stream processing framework. It includes a \
templating system which powers a command line utility."
LICENSE = "GPL-3.0-only"

PV = "0.1.3"

RPM_NAME = "python39-aina-0.1.3-4.9.noarch.rpm"
RPM_HASH = "d0677798bef265034901b1c1f25421342d7dc65e207ec77a45933dd39ef273501fbbb864fa3516b355e5c00c28be4731ab8b1f8a4b4055691527ba1a8fa3ffea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aina \
python39-aina \
python3dist-aina"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-base \
python39-click \
update-alternatives"

inherit rpm
