SUMMARY = "Virtual Machine definition tuner"
DESCRIPTION = "Helps tuning the libvirt XML definition of a virtual machine for specific use cases."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python3-virt-tuner-0.0.3-2.7.noarch.rpm"
RPM_HASH = "87e6f7f35e12058a4bb3a1d49c4eb1868e96cd40927be3e38752d824a68f28d4eeae3eef76f7ce16d367d737ef02941a3a5fa2f3f847548dbc7e711029de67f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virt-tuner \
python3.11dist-virt-tuner \
python3dist-virt-tuner"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-libvirt-python \
update-alternatives"

inherit rpm
