SUMMARY = "HTTP/2 State-Machine based protocol implementation"
DESCRIPTION = "Pure-Python implementation of a HTTP/2 protocol stack. \
It's written from the ground up to be embeddable in whatever program \
you choose to use, ensuring that you can speak HTTP/2 regardless of \
your programming paradigm."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-h2-4.1.0-3.3.noarch.rpm"
RPM_HASH = "9aa2acc503057a4970c07cce8a93cc983b031c940c33772d08428a9975c1904a2837986246b1ce72f2a79888460129d3cf27c301002da201f181a4c619c1a7e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-h2 \
python310-h2 \
python3dist-h2"

RDEPENDS:${PN} += "python-abi \
python310-hpack \
python310-hyperframe"

inherit rpm
