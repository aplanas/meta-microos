SUMMARY = "A pure Python Lex/Yacc that works with RPython"
DESCRIPTION = "RPLY is a pure Python parser generator that also works with RPython. \
It is a more-or-less direct port of David Beazley's PLY, with a new \
public API, and with RPython support."
LICENSE = "BSD-3-Clause"

PV = "0.7.8"

RPM_NAME = "python39-rply-0.7.8-2.3.noarch.rpm"
RPM_HASH = "35447fffa970621280c8de2b78c6dd3882df2f49ee2c0f5d74f1b4e4c4e35560fd375c1daee3e0edf8c2d8dd5333fd81b01b77442a91282b6605f6810a499051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rply) \
python39-rply \
python3dist(rply)"
RDEPENDS:${PN} += "python(abi) \
python39-appdirs"

inherit rpm
