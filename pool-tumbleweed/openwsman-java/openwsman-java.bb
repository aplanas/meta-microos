SUMMARY = "Java bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Java bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-java-2.7.2-2.9.noarch.rpm"
RPM_HASH = "44aa7d7024c878d9c3e4b840c0bbc52439fe23e963ec827a2659cab98ef0cad994e9cc3eeb442188e574b511dd823914c9d2cf5a8a5d46cfc6cc171f9239689b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openwsman-java"

RDEPENDS:${PN} += "java \
libwsman1"

inherit rpm
