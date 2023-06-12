SUMMARY = "A Working Python AST"
DESCRIPTION = "A Working Python AST."
LICENSE = "Python-2.0 & MIT"

PV = "0.19.1.0"

RPM_NAME = "python39-awpa-0.19.1.0-1.18.noarch.rpm"
RPM_HASH = "a6c5bb5247df333052ac4ca5e10efcd140ca897ac43c08b2d45ec8be04015e50fc02fa0b301bc7c45fcf8d12659190f25569984075a2c282177a54789b766134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(awpa) \
python39-awpa \
python3dist(awpa)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
