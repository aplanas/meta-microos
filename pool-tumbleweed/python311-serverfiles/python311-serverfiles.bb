SUMMARY = "A utility to locally store files on a HTTP server"
DESCRIPTION = "A utility that accesses files on an HTTP server and stores them \
locally for reuse."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python311-serverfiles-0.3.1-1.10.noarch.rpm"
RPM_HASH = "11e31ffc53d9986801110abbe133ef38b69a74cb7ac416e8b11d54843f45aa7df9b0c73d15d4b3e0f5c0cebe596d8f1b806bdf7ca8a93cc9ae81f07f29da9ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-serverfiles \
python3.11dist-serverfiles \
python311-serverfiles \
python3dist-serverfiles"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
