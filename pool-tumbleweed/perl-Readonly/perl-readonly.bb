SUMMARY = "Facility for creating read-only scalars, arrays, hashes"
DESCRIPTION = "Facility for creating read-only scalars, arrays, hashes"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.05"

RPM_NAME = "perl-Readonly-2.05-1.24.noarch.rpm"
RPM_HASH = "377ca905f5538955ead47d544cc805aa1cc609b4adc0c33f928788f5d52bced335ea080b18b78d74f27ff83d16f08e2ea7f8862910648d233910bcd215c0d7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Readonly \
perl-Readonly--Array \
perl-Readonly--Hash \
perl-Readonly--Scalar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
