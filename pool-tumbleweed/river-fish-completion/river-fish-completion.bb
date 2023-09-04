SUMMARY = "Fish Completion for river"
DESCRIPTION = "Fish command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-fish-completion-0.2.4+g953-2.1.noarch.rpm"
RPM_HASH = "9b7057e6d234ae8d2e9c0de828bf79de905d8c4cdd824ae0e50d0efd1e1a29440287e115f56e5c1e76506b3ad77177eb7417acc178928d2aabbed5420e5a8f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
