SUMMARY = "Bootstrap theme for MkDocs"
DESCRIPTION = "Bootstrap theme for MkDocs"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python39-mkdocs-bootstrap-1.1-1.10.noarch.rpm"
RPM_HASH = "2b28d08229aefaabf5b906c4389dbff96d7dd863d5d6e4008c8d203e0d7657090bc8ed474e29104b205b47d3f958a0dfab487a2ff838d02b2dd888e10af0ef4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mkdocs-bootstrap \
python39-mkdocs-bootstrap \
python3dist-mkdocs-bootstrap"

RDEPENDS:${PN} += "python-abi \
python39-mkdocs"

inherit rpm
