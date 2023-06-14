SUMMARY = "Tool to keep pinned dependencies up to date"
DESCRIPTION = "pip-tools keeps pinned dependencies inside a project up to date."
LICENSE = "BSD-3-Clause"

PV = "6.12.2"

RPM_NAME = "python310-pip-tools-6.12.2-1.2.noarch.rpm"
RPM_HASH = "df3c01cf8bc8403ab6331c2152bde3fca9ff0aa02f4114bb964a9f9d5ea2cbb8225bcac3a04ea38e476d97bfa8ed7951cbe3c5e498bf5ccfcbfcc8d28f96191a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-tools \
python3.10dist-pip-tools \
python310-pip-tools \
python3dist-pip-tools"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-build \
python310-click \
python310-pip \
python310-setuptools \
python310-wheel"

inherit rpm
