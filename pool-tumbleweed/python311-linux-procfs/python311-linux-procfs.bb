SUMMARY = "Linux /proc abstraction classes"
DESCRIPTION = "Abstractions to extract information from the Linux kernel /proc files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "python311-linux-procfs-0.7.1-1.5.noarch.rpm"
RPM_HASH = "e04524b933d2b023768397a57c579d7498915a8edd86eb8f9fc00d0461a8ba634491d85411fa0e57613609240644667e7df0993eeafc6b41df0268dc48864695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linux-procfs \
python3.11dist-python-linux-procfs \
python311-linux-procfs \
python3dist-python-linux-procfs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
