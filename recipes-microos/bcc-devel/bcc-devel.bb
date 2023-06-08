SUMMARY = "Header files for the BPF Compiler Collection"
DESCRIPTION = "Headers and pkg-config build descriptions for developing BCC programs."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-devel-0.26.0-2.8.aarch64.rpm"
RPM_HASH = "95ea74e64f25b1ea198cd4b07d1f965d3742c374ed522f842b28806422ad08fea8ce273a173909574a17e0a03b7279200cf4b84acb74bf3da357e4ad492e0769"

RPROVIDES:${PN} += "bcc-devel bcc-devel(aarch-64) pkgconfig(libbcc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbcc0"

inherit rpm
