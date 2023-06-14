SUMMARY = "Python source code generation library"
DESCRIPTION = "Python source code generation library (with overuse with-syntax)."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-prestring-0.9.0-2.10.noarch.rpm"
RPM_HASH = "01e8d8718a445bdb6fc50008a585d14833106cd92ee98c539e037174503956216d905c93143f4162406aed4b3efac73aff1984a178f94be5aba20d2dce2cbee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-prestring \
python311-prestring \
python3dist-prestring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
