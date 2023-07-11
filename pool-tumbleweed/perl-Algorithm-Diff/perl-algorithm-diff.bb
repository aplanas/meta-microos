SUMMARY = "Compute `intelligent' differences between two files / lists"
DESCRIPTION = "Compute `intelligent' differences between two files / lists"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.201"

RPM_NAME = "perl-Algorithm-Diff-1.201-1.12.noarch.rpm"
RPM_HASH = "6ebc08e7daea19766e0d957d3eece30ceb519a68853643b2e1771217b6675bd64b9d7e9be1297894ab1e64af85c6c95f73131a5335828aaef8dceb314489fcb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Algorithm--Diff \
perl-Algorithm--Diff---impl \
perl-Algorithm-Diff"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
