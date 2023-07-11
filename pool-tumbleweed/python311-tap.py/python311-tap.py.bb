SUMMARY = "Test Anything Protocol (TAP) tools"
DESCRIPTION = "Test Anything Protocol (TAP) tools."
LICENSE = "BSD-2-Clause"

PV = "3.1"

RPM_NAME = "python311-tap.py-3.1-1.8.noarch.rpm"
RPM_HASH = "2efd9ac6374cf18792f4c9534a425ea21dee8efdefee0e2ee0d639fa8376976d7700122e1a8d914c897d14d9721f7871d6c8227565483ca6f89f9759b672c7c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tap.py \
python3.11dist-tap.py \
python311-tap.py \
python3dist-tap.py"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
