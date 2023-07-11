SUMMARY = "Facility for creating read-only scalars, arrays, hashes"
DESCRIPTION = "Facility for creating read-only scalars, arrays, hashes"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.05"

RPM_NAME = "perl-Readonly-2.05-1.23.noarch.rpm"
RPM_HASH = "fe05e03075d00cb71e9aef68d1ed7f158a237e4a0e46a060563fc8e0b48d3e7bbcbb3bd809126df6d937ec3d998005230efa48d5e9c8888aa843f6ff6adf7526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Readonly \
perl-Readonly--Array \
perl-Readonly--Hash \
perl-Readonly--Scalar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
