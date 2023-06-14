SUMMARY = "Python module for systemd's service notification protocol"
DESCRIPTION = "A pure Python implementation of systemd's service notification protocol (sd_notify)"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-sdnotify-0.3.2-2.7.noarch.rpm"
RPM_HASH = "b45c44c93a689d4e3b7edac8e8db0efe40491676a351fba64f3931b4dbc415507ce18b67d97adea67a8b00355e49701bb963dec97c7e2454826ca2ed0ac63b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sdnotify \
python3.10dist-sdnotify \
python310-sdnotify \
python3dist-sdnotify"

RDEPENDS:${PN} += "python-abi"

inherit rpm
