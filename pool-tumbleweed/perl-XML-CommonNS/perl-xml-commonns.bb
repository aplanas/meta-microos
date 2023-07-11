SUMMARY = "A list of commonly used namespaces"
DESCRIPTION = "A list of commonly used namespaces"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-XML-CommonNS-0.06-1.26.noarch.rpm"
RPM_HASH = "35789989e98a1f7f0137c702907e90be4b5efe33c9b0af4f85a780e91d9bbdb57a5ca7fb3139ef54d1b3e8a5a509e05cd37362aeec5d622a69468bdda20cebd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--CommonNS \
perl-XML-CommonNS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML--NamespaceFactory \
perl-version"

inherit rpm
