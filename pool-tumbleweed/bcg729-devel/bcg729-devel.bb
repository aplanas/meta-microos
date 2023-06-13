SUMMARY = "Development files for libbcg729"
DESCRIPTION = "This package includes the files necessary for compiling and linking \
application which will use libbcg729."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "bcg729-devel-1.1.1-2.7.aarch64.rpm"
RPM_HASH = "9b82f783649a5bd839b874d0567887cd241b60c35dc1dd141ba316ea04250d538b73cc93432d568f172e87781dbc7aa798e6ec3014d835b7af35bcf8f9469846"

RPROVIDES:${PN} += "bcg729-devel \
bcg729-devel(aarch-64) \
pkgconfig(libbcg729)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcg729-0"

inherit rpm
