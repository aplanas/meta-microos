SUMMARY = "A pure Python Lex/Yacc that works with RPython"
DESCRIPTION = "RPLY is a pure Python parser generator that also works with RPython. \
It is a more-or-less direct port of David Beazley's PLY, with a new \
public API, and with RPython support."
LICENSE = "BSD-3-Clause"

PV = "0.7.8"

RPM_NAME = "python39-rply-0.7.8-2.5.noarch.rpm"
RPM_HASH = "a8f6bf06b6af01c978af36f7d50b681a56da1625c16636f57108f176a37725476fb01fd38726151b28a3f4ebddcbb21e154c8fe26211353cbcec207f88aadd02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rply \
python39-rply \
python3dist-rply"

RDEPENDS:${PN} += "python-abi \
python39-appdirs"

inherit rpm
