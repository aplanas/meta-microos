SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-contextvars-22.10.0-7.1.noarch.rpm"
RPM_HASH = "6ab2f0f9317196a5f8068c1ac05d05abfd85c876fbbc7dc6e84d12383cd6c92ec51bbcbc0e477e6744ce36da60ee798e3627f3292a405207da66e6a2dace2d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-contextvars"

RDEPENDS:${PN} += "python310-Twisted"

inherit rpm
