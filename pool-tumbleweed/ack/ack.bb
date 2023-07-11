SUMMARY = "Grep-Like Text Finder"
DESCRIPTION = "ack is a grep-like tool tailored to working with large trees of source code."
LICENSE = "Artistic-2.0"

PV = "3.7.0"

RPM_NAME = "ack-3.7.0-1.2.noarch.rpm"
RPM_HASH = "d7e01b0d2ae361625e19de59b612da4aba3262b096ce2a1aa33bacc9435011d9e62786050a0b9a1f5b9747408b61581eb5de65956da1a8d3028c5679819f375f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ack"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-App-Ack \
perl-base"

inherit rpm
