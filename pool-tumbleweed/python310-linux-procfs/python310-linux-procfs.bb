SUMMARY = "Linux /proc abstraction classes"
DESCRIPTION = "Abstractions to extract information from the Linux kernel /proc files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "python310-linux-procfs-0.7.1-1.5.noarch.rpm"
RPM_HASH = "bb099d117e3a8cda2fe75a5dbc284562b27b3f0c19939aef2444464e3240a7045dfeb90212b3305ae10404e91904c54b89ab0a5aa1ad102e2d9e2dd5fe83fada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-linux-procfs \
python310-linux-procfs \
python3dist-python-linux-procfs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
