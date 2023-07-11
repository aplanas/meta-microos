SUMMARY = "API documentation for xmvn-mojo"
DESCRIPTION = "This package provides API documentation for xmvn-mojo."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-mojo-javadoc-4.2.0-2.2.noarch.rpm"
RPM_HASH = "598b3d10ce74973160a47fed9950bfaedf2f6b65f32eff23b121710068beb15eb24ef8a84331c14cf1e469310a16f21d2798bf2c3eacae9fc74ba33fac9b1e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-mojo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
