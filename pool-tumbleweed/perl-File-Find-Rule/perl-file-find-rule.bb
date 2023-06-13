SUMMARY = "Alternative interface to File::Find"
DESCRIPTION = "File::Find::Rule is a friendlier interface to File::Find. It allows you to \
build rules which specify the desired files and directories."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.34"

RPM_NAME = "perl-File-Find-Rule-0.34-2.6.noarch.rpm"
RPM_HASH = "e2c45a61e5570f3abc6821eb296e7821a934a82d520ab0fd4e2e3fa615da13e3fa6a4f9ca836d1e68ccf7021505268595802a15d0eeeda8cc4ba601373af656b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Find::Rule) \
perl-File-Find-Rule"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Number::Compare) \
perl(Text::Glob)"

inherit rpm
