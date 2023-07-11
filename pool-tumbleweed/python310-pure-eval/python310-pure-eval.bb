SUMMARY = "Safely evaluate AST nodes without side effects"
DESCRIPTION = "Safely evaluate AST nodes without side effects"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-pure-eval-0.2.2-2.3.noarch.rpm"
RPM_HASH = "996f23b3eb7fa18cca33fbafd8d3aa431462bab5dc831bc133594adc99505b73fd8ed5b8785af12523a2247b547f2f5a8d6ef540ed6cfbd0a02b4ac756f9514e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pure-eval \
python310-pure-eval \
python3dist-pure-eval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
