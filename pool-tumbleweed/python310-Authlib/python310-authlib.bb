SUMMARY = "Python library for building OAuth and OpenID Connect servers"
DESCRIPTION = "A Python library for building OAuth and OpenID Connect servers."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python310-Authlib-1.2.0-1.3.noarch.rpm"
RPM_HASH = "30ed3b123d1f211876c191ad0f2ec3d440158442e7597fe5f1d003b0bea535b7666e66e2b7c342e6487aca4c41748a43db0ce233871f1e445da673e0b7104c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Authlib \
python3.10dist(authlib) \
python310-Authlib \
python3dist(authlib)"
RDEPENDS:${PN} += "python(abi) \
python310-cryptography"

inherit rpm
