SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-terminaltables-3.1.0-2.16.noarch.rpm"
RPM_HASH = "0c05d7a6d0d73edc9c1653b083168effcb850e050a3bcee63cc7d6aa1dd166a2aea3bcfe4b22932be341b0e747d96e8cd39ede6b0c8ff4d9df3cb690638770d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-terminaltables \
python3.11dist-terminaltables \
python311-terminaltables \
python3dist-terminaltables"

RDEPENDS:${PN} += "python-abi \
python311-colorama \
python311-colorclass \
python311-termcolor"

inherit rpm
