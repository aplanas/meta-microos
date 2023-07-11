SUMMARY = "ASDF schemas for transforms"
DESCRIPTION = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-asdf-transform-schemas-0.3.0-1.5.noarch.rpm"
RPM_HASH = "425d9d3513483b73e720bba5489d94813271ee306c38d76ed8d37237865831179c7e08287e7477a8b336162fafcd197cadf7927526bc63c0c3ffb6d274b815ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf-transform-schemas \
python39-asdf-transform-schemas \
python3dist-asdf-transform-schemas"

RDEPENDS:${PN} += "python-abi \
python39-asdf-standard"

inherit rpm
