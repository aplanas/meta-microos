SUMMARY = "DFU tool for updating Nitrokeys' firmware"
DESCRIPTION = "nkdfu is a Python DFU tool for updating Nitrokeys' firmware. Currently supports Nitrokey Pro only. \
Based on python-dfu project, which brings implementation of USB DFU 1.1 spec."
LICENSE = "GPL-2.0-only"

PV = "0.2"

RPM_NAME = "python310-nkdfu-0.2-1.3.noarch.rpm"
RPM_HASH = "f73efca174c83b1500aead79c66324591e8ec494d4d8cc6a1325165fdcb57abda802d6a6216448ab28746c9d108602704c24b4039981cc7050649860bf78e163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nkdfu \
python310-nkdfu \
python3dist-nkdfu"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
intelhex \
python-abi \
python310-fire \
python310-libusb1 \
python310-tqdm \
update-alternatives"

inherit rpm
