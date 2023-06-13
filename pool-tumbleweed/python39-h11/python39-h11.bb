SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/11"
DESCRIPTION = "This is a little HTTP/1.1 library written from scratch in Python, \
heavily inspired by hyper-h2 <https://hyper-h2.readthedocs.io>"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-h11-0.14.0-2.1.noarch.rpm"
RPM_HASH = "752fde929be975eaf4141942afb1c0ba9621b5f98f9bb2b5714adba76f027f34fba7f331ef391f915470e9cf4357b2215f9a0999f98f43d895b1f1fe32f5af01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(h11) \
python39-h11 \
python3dist(h11)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
