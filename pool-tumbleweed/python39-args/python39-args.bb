SUMMARY = "Python command argument interface"
DESCRIPTION = "This module gives developers an interface for command line argumemnts."
LICENSE = "BSD-2-Clause"

PV = "0.1.0"

RPM_NAME = "python39-args-0.1.0-2.16.noarch.rpm"
RPM_HASH = "0c61f5e76510964f2bcc1adcce1a23e51fd292302e71fbb1ba9914e53f7de67dcca61a7fd9f47526818e802843aba8fd8bcf9e14d31d9ec6e4c6de38e1e5242d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-args \
python39-args \
python3dist-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
