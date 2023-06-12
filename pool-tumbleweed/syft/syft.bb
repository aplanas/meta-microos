SUMMARY = "CLI tool and library for generating a Software Bill of Materials"
DESCRIPTION = "A CLI tool and Go library for generating a Software Bill of Materials (SBOM) from container images and filesystems. Exceptional for vulnerability detection when used with a scanner like Grype."
LICENSE = "Apache-2.0"

PV = "0.82.0"

RPM_NAME = "syft-0.82.0-1.1.aarch64.rpm"
RPM_HASH = "7e5badce79f22aa84b52418be1f09880d7d5fa281d2cae18b3ae206207b86c5a328c777193e7c7a3f1d597cfb42c8fa9e1eb1a8a8fe3e9456523f30c02730bf2"

RPROVIDES:${PN} += "syft \
syft(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
