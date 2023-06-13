SUMMARY = "DFU tool for updating Nitrokeys' firmware"
DESCRIPTION = "nkdfu is a Python DFU tool for updating Nitrokeys' firmware. Currently supports Nitrokey Pro only. \
Based on python-dfu project, which brings implementation of USB DFU 1.1 spec."
LICENSE = "GPL-2.0-only"

PV = "0.2"

RPM_NAME = "python310-nkdfu-0.2-1.1.noarch.rpm"
RPM_HASH = "ac5c642608b290e868525bbc28b3ea606061114a5dd7c27ddf160efc10c5a430bdf0a7e913300e39e8651a4aa5836e173f6a6e01f46a005f60ad92333d2f32de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nkdfu \
python3.10dist(nkdfu) \
python310-nkdfu \
python3dist(nkdfu)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
intelhex \
python(abi) \
python310-fire \
python310-libusb1 \
python310-tqdm \
update-alternatives"

inherit rpm
