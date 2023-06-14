SUMMARY = "A pure Python Lex/Yacc that works with RPython"
DESCRIPTION = "RPLY is a pure Python parser generator that also works with RPython. \
It is a more-or-less direct port of David Beazley's PLY, with a new \
public API, and with RPython support."
LICENSE = "BSD-3-Clause"

PV = "0.7.8"

RPM_NAME = "python310-rply-0.7.8-2.3.noarch.rpm"
RPM_HASH = "24bf907b88ae94bfc348f1deefb8e35b9deb2034c5bc13aad3da342e23e04447881585783255f0514bfcc5e3371ce4893ae0562acfc9a50b7106ee28db8e342a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rply \
python3.10dist-rply \
python310-rply \
python3dist-rply"

RDEPENDS:${PN} += "python-abi \
python310-appdirs"

inherit rpm
