SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.8"

RPM_NAME = "python311-duet-0.2.8-1.3.noarch.rpm"
RPM_HASH = "68742c5a25c4e49d595e4cd7378b9f74ca4b0130b180597d05fa6a3a406806b4a169fd765f22c0041926144bbb61aaa9883399d4567f6e92065bef567393772c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-duet \
python3.11dist-duet \
python311-duet \
python3dist-duet"

RDEPENDS:${PN} += "python-abi \
python311-typing-extensions"

inherit rpm
