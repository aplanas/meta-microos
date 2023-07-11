SUMMARY = "Data files for Taisei"
DESCRIPTION = "Data files for Taisei, an open clone of the Touhou Project series. Touhou is a \
one-man project of shoot ’em up games set in an isolated world full of \
Japanese folklore."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "taisei-data-1.3.2-2.13.noarch.rpm"
RPM_HASH = "5f39f22fd244c56b0edffe21c9fdedaf6b6985acf86e12473a602ff0bdf66b6dee098f6895de10770fc113e58bad8aa418770b93fe5cb67b6281ba8d903cf209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "taisei-data"

RDEPENDS:${PN} += "taisei"

inherit rpm
