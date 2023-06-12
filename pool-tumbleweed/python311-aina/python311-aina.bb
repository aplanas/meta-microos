SUMMARY = "A general-purpose stream processing framework"
DESCRIPTION = "Aina is a general-purpose stream processing framework. It includes a \
templating system which powers a command line utility."
LICENSE = "GPL-3.0-only"

PV = "0.1.3"

RPM_NAME = "python311-aina-0.1.3-4.9.noarch.rpm"
RPM_HASH = "781260693e267e748e8fb390d12b93de7d0cb397e3c9171d8c4871be70d594a5ceccfb8dfe068bce195ca5282c9fff06a81adeaf34aeaa6171d7abdc09817e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aina) \
python311-aina \
python3dist(aina)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-base \
python311-click \
update-alternatives"

inherit rpm
