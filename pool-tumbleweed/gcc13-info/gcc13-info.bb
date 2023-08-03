SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-info-13.1.1+git7597-1.1.noarch.rpm"
RPM_HASH = "683f11e0e6fe54adb948ca05ed2ff01f24f5cdac05897d97249e02387e1a804bc92a44fe71e15b3588496f4cecf11b514619efd13ddf09026749933905e15246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc13-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
