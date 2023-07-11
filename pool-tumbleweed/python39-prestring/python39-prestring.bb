SUMMARY = "Python source code generation library"
DESCRIPTION = "Python source code generation library (with overuse with-syntax)."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-prestring-0.9.0-2.12.noarch.rpm"
RPM_HASH = "6ffc22361387905e086a320e6665a13a4629c6d20c3b845716cebf166116ff62fbcce56eeb2a117692034ff28ac295b093d16a3dbd083dd2e99ba8b47409c842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-prestring \
python39-prestring \
python3dist-prestring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
