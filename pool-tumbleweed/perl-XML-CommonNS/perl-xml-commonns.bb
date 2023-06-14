SUMMARY = "A list of commonly used namespaces"
DESCRIPTION = "A list of commonly used namespaces"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-XML-CommonNS-0.06-1.25.noarch.rpm"
RPM_HASH = "7fdce977bdd454b159c1452218671f20ec391dbee9897c3f4f7f2832ec448ecd5bf3c50c185d0c2865c1f8a1f7ce5f48870dc64dbf1f5c1f3065f073bbba862b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--CommonNS \
perl-XML-CommonNS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-XML--NamespaceFactory \
perl-version"

inherit rpm
