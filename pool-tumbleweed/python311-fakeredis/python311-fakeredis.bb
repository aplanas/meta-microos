SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.17.0"

RPM_NAME = "python311-fakeredis-2.17.0-1.1.noarch.rpm"
RPM_HASH = "b61c396fdc249e306a4260683a9da362f9d55c0caa2132f1167380450607e7597f69752435f754a42e48a66a025b132645911d0c036e885d0fd44dd358d585d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fakeredis \
python3.11dist-fakeredis \
python311-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-redis \
python311-sortedcontainers"

inherit rpm
