SUMMARY = "KIWI - Cross Image Arch Prepare Plugin"
DESCRIPTION = "Prepare an image root tree for a cross architecture build process."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "python3-kiwi_crossprepare_plugin-0.1.5-11.8.aarch64.rpm"
RPM_HASH = "18e50151664fcf55ca40e10be3edf30af8365d5d5d31a10d5c510d20717cda023155fce4df9feb64a8b9bfa8cdb6c40b624dd77794f11506c317289a6fc6994d"

RPROVIDES:${PN} += "python3-kiwi_crossprepare_plugin \
python3-kiwi_crossprepare_plugin(aarch-64) \
python3.10dist(kiwi-crossprepare-plugin) \
python3dist(kiwi-crossprepare-plugin)"

RDEPENDS:${PN} += "python(abi) \
python3-PyYAML \
python3-docopt \
python3-kiwi \
python3-setuptools \
qemu-linux-user"

inherit rpm
