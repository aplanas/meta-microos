SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install the binary to try it out. Works with Syft, the powerful SBOM (software bill of materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.64.1"

RPM_NAME = "grype-0.64.1-1.1.aarch64.rpm"
RPM_HASH = "e4dd73bd08a7fd6973949bcbc42db17d7a44462b332fb8a118309367ebecdb2cbc985c19a4cc6042b1d1f678abf7a228c9f956786ef1e4e00e5629ee2352f2d8"

RPROVIDES:${PN} += "grype"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
