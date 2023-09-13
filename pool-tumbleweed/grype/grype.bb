SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install the binary to try it out. Works with Syft, the powerful SBOM (software bill of materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.66.0"

RPM_NAME = "grype-0.66.0-1.1.aarch64.rpm"
RPM_HASH = "ddfa6241caa5763846b2a0ba3981091af6e92d966cce107fd9172aeed06b3964a2f4ff1b61ad93b5add5bdaf372cd0424dd816cb934b551256fd8a69d668423c"

RPROVIDES:${PN} += "grype"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
