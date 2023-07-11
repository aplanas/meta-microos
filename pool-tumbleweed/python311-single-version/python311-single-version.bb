SUMMARY = "Have a single source of version in your code base"
DESCRIPTION = "Utility to let you have a single source of version in your code base."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-single-version-1.5.1-1.11.noarch.rpm"
RPM_HASH = "a8a3f155125d1ca5fc35dfa70db34df9569290df6cbeaf72ade96174df247df9459513d2b79538a9d4fe4a5c66cfd5f750fddba4e29dbdb8fa87536a4834a760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-single-version \
python3.11dist-single-version \
python311-single-version \
python3dist-single-version"

RDEPENDS:${PN} += "python-abi \
python311-first \
python311-importlib-metadata"

inherit rpm
