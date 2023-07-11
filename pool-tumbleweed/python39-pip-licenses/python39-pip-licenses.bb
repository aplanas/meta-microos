SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "python39-pip-licenses-4.3.2-1.3.noarch.rpm"
RPM_HASH = "1ec80642d34009ec816cd60147a54a6a83c1594f822750e189bca69d242fd67b38186bf8702baa63019d5099e982f208608ff7d09172db0017240e4abf60df8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pip-licenses \
python39-pip-licenses \
python3dist-pip-licenses"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PrettyTable \
python39-pip \
update-alternatives"

inherit rpm
