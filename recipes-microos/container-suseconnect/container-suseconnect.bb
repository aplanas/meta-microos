SUMMARY = "Provides access to repositories inside containers"
DESCRIPTION = "container-suseconnect gives access to package repositories inside containers \
using the host machine entitlements."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "container-suseconnect-2.4.0-1.3.aarch64.rpm"
RPM_HASH = "d3bbefc4dc05d03696ff8c65bfa4d0befee95b6d2973769c132b473c935aea2f2025673e38c95bdd5a2e0edcdf27939f1702396c9f265e24cd3b0eccd0aeb6ba"

RPROVIDES:${PN} += "container-suseconnect container-suseconnect(aarch-64)"
RDEPENDS:${PN} += "libzypp"

inherit rpm
