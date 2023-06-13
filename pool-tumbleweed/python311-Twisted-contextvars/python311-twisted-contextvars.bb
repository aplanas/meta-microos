SUMMARY = "Contextvars extra for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional dependency contextvars"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-contextvars-22.10.0-6.1.noarch.rpm"
RPM_HASH = "8f616458f639ed037255c5259fd500c1cd16e3fc7710c7f6b7ae9c267a84e9027b1763cb9a86bce8ab9d79ff76f3b62c457c74fdc7a678dbea2fae7dcaf22299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-contextvars"

RDEPENDS:${PN} += "python311-Twisted"

inherit rpm
