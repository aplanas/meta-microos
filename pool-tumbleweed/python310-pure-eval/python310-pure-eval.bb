SUMMARY = "Safely evaluate AST nodes without side effects"
DESCRIPTION = "Safely evaluate AST nodes without side effects"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-pure-eval-0.2.2-2.1.noarch.rpm"
RPM_HASH = "3a4974133260b6deb431e51cdceb1c4413565e1e779295aed40c91a1dbbebd39cf307f47fd62296c76bbc3a92dab073c3828fe78ac29e4707792d6f4cdeab54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pure-eval \
python3.10dist(pure-eval) \
python310-pure-eval \
python3dist(pure-eval)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
