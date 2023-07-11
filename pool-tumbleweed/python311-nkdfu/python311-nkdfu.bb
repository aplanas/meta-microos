SUMMARY = "DFU tool for updating Nitrokeys' firmware"
DESCRIPTION = "nkdfu is a Python DFU tool for updating Nitrokeys' firmware. Currently supports Nitrokey Pro only. \
Based on python-dfu project, which brings implementation of USB DFU 1.1 spec."
LICENSE = "GPL-2.0-only"

PV = "0.2"

RPM_NAME = "python311-nkdfu-0.2-1.3.noarch.rpm"
RPM_HASH = "c9445e5d86b1704c27b6459111f43ea79fe019897ebe48aef3197c51f7a8ccf3d01cd5d4cc40841060e2947dd627e7e3f50b662177a1a2a6dd80584db8767fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nkdfu \
python3.11dist-nkdfu \
python311-nkdfu \
python3dist-nkdfu"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
intelhex \
python-abi \
python311-fire \
python311-libusb1 \
python311-tqdm \
update-alternatives"

inherit rpm
