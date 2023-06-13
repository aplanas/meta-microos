SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-timeout-decorator-0.5.0-1.1.noarch.rpm"
RPM_HASH = "54bdb640e6a2247ab4f050facdd4ee54f50def6d3f38af1b00263ed305c08c242a1b230966e910fdc08c0afd6570ec1725a1f642abd1a068a6c38de7da3379b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-timeout-decorator \
python3.10dist(timeout-decorator) \
python310-timeout-decorator \
python3dist(timeout-decorator)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
