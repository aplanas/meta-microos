SUMMARY = "CLI tool and library for generating a Software Bill of Materials"
DESCRIPTION = "A CLI tool and Go library for generating a Software Bill of Materials (SBOM) from container images and filesystems. Exceptional for vulnerability detection when used with a scanner like Grype."
LICENSE = "Apache-2.0"

PV = "0.84.1"

RPM_NAME = "syft-0.84.1-1.1.aarch64.rpm"
RPM_HASH = "e16acb3a0a9b042b70517387f69b10814489a1b39453b166bb16b29cdfa116a3976a425eaa693ee025f2e48fdc451e459d1f156a42b12f197d719f193edc7bb6"

RPROVIDES:${PN} += "syft"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
