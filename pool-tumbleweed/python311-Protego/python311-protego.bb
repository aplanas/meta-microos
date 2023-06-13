SUMMARY = "Pure-Python robotstxt parser with support for modern conventions"
DESCRIPTION = "Protego is a pure-Python `robots.txt` parser with support for modern conventions."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python311-Protego-0.2.1-2.3.noarch.rpm"
RPM_HASH = "0f5f3ff49c444f6a2435491243702ad9f8bfec79cd220136d690cf0c9057fbe1693142dd05b3fe595fb46b8804d62b5b207ad474ee3751c44ddbe2a7dfdc10b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(protego) \
python311-Protego \
python3dist(protego)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
