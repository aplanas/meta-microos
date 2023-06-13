SUMMARY = "Linux /proc abstraction classes"
DESCRIPTION = "Abstractions to extract information from the Linux kernel /proc files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "python310-linux-procfs-0.7.1-1.4.noarch.rpm"
RPM_HASH = "e03f7918ed23b8656f4800cc0b88d70211893c5592dc2a67d9d00f060475cd50d0d949451d23c4f8824fa0fe819275faf8a684c66bc0dad78904e07dc995b528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linux-procfs \
python3.10dist(python-linux-procfs) \
python310-linux-procfs \
python3dist(python-linux-procfs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-six \
update-alternatives"

inherit rpm
