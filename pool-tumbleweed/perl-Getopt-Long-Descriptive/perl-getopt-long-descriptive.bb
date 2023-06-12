SUMMARY = "Getopt::Long, but simpler and more powerful"
DESCRIPTION = "Getopt::Long::Descriptive is yet another Getopt library. It's built atop \
Getopt::Long, and gets a lot of its features, but tries to avoid making you \
think about its huge array of options. \
 \
It also provides usage (help) messages, data validation, and a few other \
useful features."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.111"

RPM_NAME = "perl-Getopt-Long-Descriptive-0.111-1.2.noarch.rpm"
RPM_HASH = "5674e5c7589ec0cd636e41b6a3dee13f55229b37b956d11a6490c3fc6b14cf30e14651c589bcbd536f657912b7378e2fbf3ecb766cf0d694b870c291a37f352d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Getopt::Long::Descriptive) \
perl(Getopt::Long::Descriptive::Opts) \
perl(Getopt::Long::Descriptive::Usage) \
perl-Getopt-Long-Descriptive"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Params::Validate) \
perl(Sub::Exporter) \
perl(Sub::Exporter::Util)"

inherit rpm
