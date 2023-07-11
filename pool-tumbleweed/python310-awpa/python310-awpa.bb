SUMMARY = "A Working Python AST"
DESCRIPTION = "A Working Python AST."
LICENSE = "Python-2.0 & MIT"

PV = "0.19.1.0"

RPM_NAME = "python310-awpa-0.19.1.0-1.20.noarch.rpm"
RPM_HASH = "a68b38711779079a4b1ce51a53b2d0e20b4fb239860386b500d0c77bdee207de3cce9389eb41c0949a09d4ed1957d40cfbaa2b79d116d37650d1dca3b02bae90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-awpa \
python310-awpa \
python3dist-awpa"

RDEPENDS:${PN} += "python-abi"

inherit rpm
