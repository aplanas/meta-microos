SUMMARY = "Python library for building OAuth and OpenID Connect servers"
DESCRIPTION = "A Python library for building OAuth and OpenID Connect servers."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python311-Authlib-1.2.0-1.3.noarch.rpm"
RPM_HASH = "2597756a14f2dabdc89deae332e8386d1e8be648dce216568fb2425bba003a814097f6fb263d3fe9800d4e5471acade27a9aeb4c357796f8d828cd04dfb45602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(authlib) \
python311-Authlib \
python3dist(authlib)"
RDEPENDS:${PN} += "python(abi) \
python311-cryptography"

inherit rpm
