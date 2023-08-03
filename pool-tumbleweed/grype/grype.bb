SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install the binary to try it out. Works with Syft, the powerful SBOM (software bill of materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.65.0"

RPM_NAME = "grype-0.65.0-1.1.aarch64.rpm"
RPM_HASH = "8bea5d1ddb2f60285abf378ff3d62fe7683154b4fe4775aca356ccffc15e6d67828eabc693b20bace92a12ea5d7324272735b7aecd3508791a8ebbd252ac822b"

RPROVIDES:${PN} += "grype"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
