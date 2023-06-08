SUMMARY = "Javadoc for bouncycastle"
DESCRIPTION = "API documentation for the Bouncy Castle Cryptography APIs."
LICENSE = "MIT"

PV = "1.73"

RPM_NAME = "bouncycastle-javadoc-1.73-1.1.noarch.rpm"
RPM_HASH = "6aab1defa8b3ea521a058d3cdf05656dc09f98a64a76f820f31d851477a2efbc852554721338f3d17420e7d90fec6a95153fd13770e44b11bcac0290c110454f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
