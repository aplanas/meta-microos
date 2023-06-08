SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-info-7.5.0+r278197-12.5.noarch.rpm"
RPM_HASH = "84ad0fd9a14f3f8b0a3b2aff6dde587112672553b2135b49b928b83811da753f2659165571367f706f5d970f7b520fbbad922ddbb3dfd6c4147074af91d3845b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc7-info"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
