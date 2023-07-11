SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install the binary to try it out. Works with Syft, the powerful SBOM (software bill of materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.63.1"

RPM_NAME = "grype-0.63.1-1.1.aarch64.rpm"
RPM_HASH = "1e47ce87a83b830b0438f814bf1fb1981781f71ff0f76fdc71b19002feab1ba1852afd36acd161cad7fdc14c6cecc272e79de65ee8a1bbce5adb4e1544e0b8da"

RPROVIDES:${PN} += "grype"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
