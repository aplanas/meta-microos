SUMMARY = "Python command argument interface"
DESCRIPTION = "This module gives developers an interface for command line argumemnts."
LICENSE = "BSD-2-Clause"

PV = "0.1.0"

RPM_NAME = "python311-args-0.1.0-2.16.noarch.rpm"
RPM_HASH = "2ee0467f8d4cdbcff64fb2d2bd60dcaa905d39f1211e9a89e3fdbace821c18f9cb432f8f0a9759db861ff43bfdf69697073a88b2358b595dc413467452d6d6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-args \
python3.11dist-args \
python311-args \
python3dist-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
