SUMMARY = "A list of commonly used namespaces"
DESCRIPTION = "A list of commonly used namespaces"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-XML-CommonNS-0.06-1.27.noarch.rpm"
RPM_HASH = "6222348b86aa6fb1984b5832fa3d7bb8c169690bf3f4ecda63204a3011b2c6ed1ead313e4069a3d7d24b7f6dde2ad453612175212ac9c00a916dc8b522233b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--CommonNS \
perl-XML-CommonNS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML--NamespaceFactory \
perl-version"

inherit rpm
