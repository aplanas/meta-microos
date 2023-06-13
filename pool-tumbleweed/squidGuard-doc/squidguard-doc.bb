SUMMARY = "Documentation and examples for squidGuard"
DESCRIPTION = "This package contains documentation for SquidGuard, a filter, redirector, \
and access controller plugin for squid."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "squidGuard-doc-1.6.0-1.14.aarch64.rpm"
RPM_HASH = "38e931e36562709c8caa0253e5ba2939136e24d22c845f129ed1f82568016301db2041e4150006e31f2f978a5899908fdebb752a9045f3f8f0f4f1ef75504be0"

RPROVIDES:${PN} += "squidGuard-doc \
squidGuard-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
