SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-info-7.5.0+r278197-14.3.noarch.rpm"
RPM_HASH = "28014285c68e34641a9534c1365a8af01152210ee3da3a58631a4aaf47552b7c63127042436f2282375e774fcecc452754b57fb530c9e169f9f18dcf8796cfad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc7-info"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
