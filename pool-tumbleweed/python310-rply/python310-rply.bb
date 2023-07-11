SUMMARY = "A pure Python Lex/Yacc that works with RPython"
DESCRIPTION = "RPLY is a pure Python parser generator that also works with RPython. \
It is a more-or-less direct port of David Beazley's PLY, with a new \
public API, and with RPython support."
LICENSE = "BSD-3-Clause"

PV = "0.7.8"

RPM_NAME = "python310-rply-0.7.8-2.5.noarch.rpm"
RPM_HASH = "f2bbd95955cdc6394ef7ea8a673df698e5827258b0b4b84f24f3efa83a39a522dccfd8bb56531dc8612ec3f909adebc8058893f48ed61e08093f3e7a1d0d0826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rply \
python310-rply \
python3dist-rply"

RDEPENDS:${PN} += "python-abi \
python310-appdirs"

inherit rpm
