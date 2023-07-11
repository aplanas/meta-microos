SUMMARY = "Facility for creating read-only scalars, arrays, and hashes"
DESCRIPTION = "Facility for creating read-only scalars, arrays, and hashes"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.014"

RPM_NAME = "perl-Const-Fast-0.014-1.26.noarch.rpm"
RPM_HASH = "e4d13410b2f0e147dfdd75bdee7d1d17b328af5d30b091c9a01e05265f7aab72944f8140d9419cbe39ae4f3d3ba7127ce8ca412346a4f1ae3596c3d269a14885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Const--Fast \
perl-Const-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Sub--Exporter--Progressive"

inherit rpm
