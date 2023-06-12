SUMMARY = "Grep-Like Text Finder"
DESCRIPTION = "ack is a grep-like tool tailored to working with large trees of source code."
LICENSE = "Artistic-2.0"

PV = "3.7.0"

RPM_NAME = "ack-3.7.0-1.1.noarch.rpm"
RPM_HASH = "aded055c44c966d317e0d0f69df1b9970854c54752e58fba7005f27719a04ac1f3506fe694627f14c706595ef3d2ff141833fe8868ec04b3dcc30e18140bd535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ack"
RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-App-Ack \
perl-base"

inherit rpm
