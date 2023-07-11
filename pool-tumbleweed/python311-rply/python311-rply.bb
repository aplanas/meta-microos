SUMMARY = "A pure Python Lex/Yacc that works with RPython"
DESCRIPTION = "RPLY is a pure Python parser generator that also works with RPython. \
It is a more-or-less direct port of David Beazley's PLY, with a new \
public API, and with RPython support."
LICENSE = "BSD-3-Clause"

PV = "0.7.8"

RPM_NAME = "python311-rply-0.7.8-2.5.noarch.rpm"
RPM_HASH = "4bde90285f55671096beacd89f7944ae9c3ed258f97c6010276bc8f756644cf6cf35eb4a7417e6fc0605b100ea9072b6fa6b99d746f75a4921cd83c8b05946bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rply \
python3.11dist-rply \
python311-rply \
python3dist-rply"

RDEPENDS:${PN} += "python-abi \
python311-appdirs"

inherit rpm
