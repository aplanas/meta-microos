SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.15.0"

RPM_NAME = "python39-fakeredis-2.15.0-1.1.noarch.rpm"
RPM_HASH = "a531486e3e0af37766ce41909ae9be6552cac81f99ee2e497e02fdc20a73e23ebbca9b85db289b0ee9e2585bc5be9c792d428bb1bf0ec591e121ec0e16ff39be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fakeredis \
python39-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-redis \
python39-sortedcontainers"

inherit rpm
