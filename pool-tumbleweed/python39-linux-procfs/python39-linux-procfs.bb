SUMMARY = "Linux /proc abstraction classes"
DESCRIPTION = "Abstractions to extract information from the Linux kernel /proc files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "python39-linux-procfs-0.7.1-1.5.noarch.rpm"
RPM_HASH = "02373d239b6649bc6c0802d1f27c31810c084b9363370c526bd13e1482f5ce4fa1f86184bb8214edcaf4fa0a61a5f71b4f8599bd87f852ce86ade1003946cfb8"
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
