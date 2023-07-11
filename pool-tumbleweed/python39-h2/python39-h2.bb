SUMMARY = "HTTP/2 State-Machine based protocol implementation"
DESCRIPTION = "Pure-Python implementation of a HTTP/2 protocol stack. \
It's written from the ground up to be embeddable in whatever program \
you choose to use, ensuring that you can speak HTTP/2 regardless of \
your programming paradigm."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-h2-4.1.0-3.3.noarch.rpm"
RPM_HASH = "2305fcb999db84a906b8de201d8d3814d7a9da650544645309f5b2e5bcd4e57b98723693c30a6d0b1888ba43d0e166ba71996b1a627a97e4b3ac10b61d535664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-h2 \
python39-h2 \
python3dist-h2"

RDEPENDS:${PN} += "python-abi \
python39-hpack \
python39-hyperframe"

inherit rpm
