SUMMARY = "Getopt::Long, but simpler and more powerful"
DESCRIPTION = "Getopt::Long::Descriptive is yet another Getopt library. It's built atop \
Getopt::Long, and gets a lot of its features, but tries to avoid making you \
think about its huge array of options. \
 \
It also provides usage (help) messages, data validation, and a few other \
useful features."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.111"

RPM_NAME = "perl-Getopt-Long-Descriptive-0.111-1.4.noarch.rpm"
RPM_HASH = "a0a9bbfe0fd759fc1569a669e078e417cd635ebb9498767aadfc8f31a0482d950b22987997e3f2e698bfc4b06738ed7e70befd89505148fabe289538fe8a515e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Getopt--Long--Descriptive \
perl-Getopt--Long--Descriptive--Opts \
perl-Getopt--Long--Descriptive--Usage \
perl-Getopt-Long-Descriptive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Params--Validate \
perl-Sub--Exporter \
perl-Sub--Exporter--Util"

inherit rpm
