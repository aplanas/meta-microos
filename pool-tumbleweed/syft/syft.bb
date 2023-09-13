SUMMARY = "CLI tool and library for generating a Software Bill of Materials"
DESCRIPTION = "A CLI tool and Go library for generating a Software Bill of Materials (SBOM) from container images and filesystems. Exceptional for vulnerability detection when used with a scanner like Grype."
LICENSE = "Apache-2.0"

PV = "0.89.0"

RPM_NAME = "syft-0.89.0-1.1.aarch64.rpm"
RPM_HASH = "f3ac9658a1ab4e2438565967b88d20f63d054f9a979c7abc66fd283d9b5e5852838849ce555bde55d6bef732acac23a616d99b165006ac76100b32e3dde3b4fa"

RPROVIDES:${PN} += "syft"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
