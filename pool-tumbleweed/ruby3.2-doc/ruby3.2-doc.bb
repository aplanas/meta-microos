SUMMARY = "Documentation and samples for Ruby"
DESCRIPTION = "Documentation and samples for Ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-doc-3.2.2-1.2.aarch64.rpm"
RPM_HASH = "a5ec301552ef1210cf363326322e32704a7f83806dd67dd74c120708783d748b670f7510bab57995bc81c731be204620b9c44fca8bf5456117285515966cfd6a"

RPROVIDES:${PN} += "ruby3.2-doc"

RDEPENDS:${PN} += ""

inherit rpm
