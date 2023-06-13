SUMMARY = "HTTP/2 framing layer for Python"
DESCRIPTION = "This library contains the HTTP/2 framing code used in the hyper project. \
It provides a pure-Python codebase that is capable of decoding a binary \
stream into HTTP/2 frames."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python311-hyperframe-6.0.1-2.1.noarch.rpm"
RPM_HASH = "c737370ccab5d598af7ae2c73aeafa820ce132ff3369b764a3e5977d53155cf1c631d12e2143dfdabe13c216a4c033b2bb3e94c0a694bb93ad4780d82a81675e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hyperframe) \
python311-hyperframe \
python3dist(hyperframe)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
