SUMMARY = "DFU tool for updating Nitrokeys' firmware"
DESCRIPTION = "nkdfu is a Python DFU tool for updating Nitrokeys' firmware. Currently supports Nitrokey Pro only. \
Based on python-dfu project, which brings implementation of USB DFU 1.1 spec."
LICENSE = "GPL-2.0-only"

PV = "0.2"

RPM_NAME = "python39-nkdfu-0.2-1.1.noarch.rpm"
RPM_HASH = "832d80ef435c1333e0af5b84afb9ea660b06c59eda9dd2ed45f3b1e8b11a81c6b99cdcae35c8be30d588bf76fcc2685ed420c1d78269f7c47e097db6815c6410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nkdfu \
python39-nkdfu \
python3dist-nkdfu"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
intelhex \
python-abi \
python39-fire \
python39-libusb1 \
python39-tqdm \
update-alternatives"

inherit rpm
