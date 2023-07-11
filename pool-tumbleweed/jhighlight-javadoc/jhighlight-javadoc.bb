SUMMARY = "Javadocs for jhighlight"
DESCRIPTION = "This package contains the API documentation for jhighlight."
LICENSE = "CDDL-1.0 | LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "jhighlight-javadoc-1.0.1-2.11.noarch.rpm"
RPM_HASH = "9886d9a6025e156f5cb19bf1ff7cca52e015e63a0454b9ff3b700d6f6f31e2d19e2da18a4ce010a5a4e24ff23e2318374e65c108a970dbb01c313d6aee3ef79f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jhighlight-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
