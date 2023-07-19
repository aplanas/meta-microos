SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install the binary to try it out. Works with Syft, the powerful SBOM (software bill of materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.64.0"

RPM_NAME = "grype-0.64.0-1.1.aarch64.rpm"
RPM_HASH = "462b4f92570e7c27ea5bbe03be0176b6b9084b3280c8b4fcae926ff12415eb981a32466c07d47da682dff97e8848120171443efaabd5d2aa62b54dd3125cb245"

RPROVIDES:${PN} += "grype"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
