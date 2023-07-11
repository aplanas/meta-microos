SUMMARY = "PEP517 for the Meson build system"
DESCRIPTION = "This package contains a Python module that implements PEP517 for \
the Meson build system."
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "python311-mesonpep517-0.2-1.2.noarch.rpm"
RPM_HASH = "50d58c275352a10983921f09c45a318899a0e3fc0c35c747b816fbc8a44af9d567f5a285f5c6837543c60d2e37cb427777a619e571064d8ce2bc5ab1044393f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mesonpep517 \
python3.11dist-mesonpep517 \
python311-mesonpep517 \
python3dist-mesonpep517"

RDEPENDS:${PN} += "meson \
python-abi \
python311-setuptools \
python311-toml \
python311-wheel"

inherit rpm
