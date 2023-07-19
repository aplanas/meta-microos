SUMMARY = "CLI tool and library for generating a Software Bill of Materials"
DESCRIPTION = "A CLI tool and Go library for generating a Software Bill of Materials (SBOM) from container images and filesystems. Exceptional for vulnerability detection when used with a scanner like Grype."
LICENSE = "Apache-2.0"

PV = "0.85.0"

RPM_NAME = "syft-0.85.0-1.1.aarch64.rpm"
RPM_HASH = "f7819e30990ce896b80ba97e8228eb543f12ad7faae6494acbd245ea4cafe4895b8941494df5f378cfccdc0b04cd103d8aade18b03861759b6c48ffe7be717bf"

RPROVIDES:${PN} += "syft"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
