SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.17.0"

RPM_NAME = "python39-fakeredis-2.17.0-1.1.noarch.rpm"
RPM_HASH = "05e4e8c1c4704b369d7c34dca5ae61e2972615341a89212154df644c7d3da6e713fc1a85334559aedd413b250ce9f80968b1bbac0efa5133a9bf12dfeeeff509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fakeredis \
python39-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-redis \
python39-sortedcontainers"

inherit rpm
