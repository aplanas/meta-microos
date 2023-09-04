SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install the binary to try it out. Works with Syft, the powerful SBOM (software bill of materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.65.1"

RPM_NAME = "grype-0.65.1-1.1.aarch64.rpm"
RPM_HASH = "61ac82c5c05d232e677dd4c63cf261616056638b5ab9db193e5445cf51b7907e9210b82f4a75e41516c5f75815e0c5b00a0bf01dd46d46dcc5830e012fdb8b29"

RPROVIDES:${PN} += "grype"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
