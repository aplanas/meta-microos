SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.13.15"

RPM_NAME = "go1.13-doc-1.13.15-2.16.aarch64.rpm"
RPM_HASH = "99ed03709997a1029f6ab9ee3f683c6fe093f0864b7b9fbcf8f0c843f3a3df4def7c8fe6e77f75c2ea41c42abc07bf21c8528e1064127f0b47da629308f5ff3e"

RPROVIDES:${PN} += "go-doc \
go1.13-doc"

RDEPENDS:${PN} += "go1.13"

inherit rpm
