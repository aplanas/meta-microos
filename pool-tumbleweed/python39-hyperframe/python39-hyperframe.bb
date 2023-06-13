SUMMARY = "HTTP/2 framing layer for Python"
DESCRIPTION = "This library contains the HTTP/2 framing code used in the hyper project. \
It provides a pure-Python codebase that is capable of decoding a binary \
stream into HTTP/2 frames."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python39-hyperframe-6.0.1-2.1.noarch.rpm"
RPM_HASH = "bb81fb61ac05c89e17dddec4e2f0bfa2063b75378302e43499a619180ca9608d2da6d0d659145340ba4238471f0485a0880331975556b0267f140ec19dbec056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hyperframe) \
python39-hyperframe \
python3dist(hyperframe)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
