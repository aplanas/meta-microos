SUMMARY = "KIWI - Cross Image Arch Prepare Plugin"
DESCRIPTION = "Prepare an image root tree for a cross architecture build process."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "python3-kiwi_crossprepare_plugin-0.1.5-11.9.aarch64.rpm"
RPM_HASH = "4c4f69dc32ffb50db0a867f32f04d55aeb336042f80aa5c9f6d5ec109d7cbcdeb5c261c1375abf19d81d9b32c253d97d17b39881335834c93590cfa75e564dfb"

RPROVIDES:${PN} += "python3-kiwi-crossprepare-plugin \
python3.11dist-kiwi-crossprepare-plugin \
python3dist-kiwi-crossprepare-plugin"

RDEPENDS:${PN} += "python-abi \
python3-PyYAML \
python3-docopt \
python3-kiwi \
python3-setuptools \
qemu-linux-user"

inherit rpm
