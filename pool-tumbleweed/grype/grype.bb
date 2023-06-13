SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install the binary to try it out. Works with Syft, the powerful SBOM (software bill of materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.62.2"

RPM_NAME = "grype-0.62.2-1.1.aarch64.rpm"
RPM_HASH = "cf8eb25b5ca706ab96955ec0539aac2e13801ca52a5caef180be7058ad91d377c1bf6a63d3b563a94638346cc894b06aae21a4d74036923e4007a13611be0860"

RPROVIDES:${PN} += "grype \
grype(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
