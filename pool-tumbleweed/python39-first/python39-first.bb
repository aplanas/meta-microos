SUMMARY = "Python library to return the first true value of an iterable"
DESCRIPTION = "A Python library that returns the first true value of an iterable."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-first-2.0.2-4.3.noarch.rpm"
RPM_HASH = "f566f7a28b94523832939753cb7024c916bd08cedde9effd5a4abdd3e620dcedb8ca75427c8793480ce78b4ae26b1efe281be7c80ae81c59dc2d4ea4eea7d990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(first) \
python39-first \
python3dist(first)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
