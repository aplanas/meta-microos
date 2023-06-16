SUMMARY = "Linux /proc abstraction classes"
DESCRIPTION = "Abstractions to extract information from the Linux kernel /proc files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "python39-linux-procfs-0.7.1-1.4.noarch.rpm"
RPM_HASH = "54a0e1a45bac2298b1f42910eaf30552f48ca0f53eab860f298648092c4dacf7319459cf807ba232646b634a948d18946a03a148cac9c6fd162a340e9711e385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-linux-procfs \
python39-linux-procfs \
python3dist-python-linux-procfs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
update-alternatives"

inherit rpm
