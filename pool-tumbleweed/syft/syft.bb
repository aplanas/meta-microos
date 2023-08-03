SUMMARY = "CLI tool and library for generating a Software Bill of Materials"
DESCRIPTION = "A CLI tool and Go library for generating a Software Bill of Materials (SBOM) from container images and filesystems. Exceptional for vulnerability detection when used with a scanner like Grype."
LICENSE = "Apache-2.0"

PV = "0.86.1"

RPM_NAME = "syft-0.86.1-1.1.aarch64.rpm"
RPM_HASH = "16a54a456899ca681eedfc1b77e76c60600541c38ee867f3d74bd3ea33241fca59ffc8435a5fa0fe576b1f7b0e7e86dc53fbcf35ce66a6e26e38e7af15b57cfc"

RPROVIDES:${PN} += "syft"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
