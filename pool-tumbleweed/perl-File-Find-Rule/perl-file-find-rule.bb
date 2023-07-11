SUMMARY = "Alternative interface to File::Find"
DESCRIPTION = "File::Find::Rule is a friendlier interface to File::Find. It allows you to \
build rules which specify the desired files and directories."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.34"

RPM_NAME = "perl-File-Find-Rule-0.34-2.7.noarch.rpm"
RPM_HASH = "bbc4b0c796f9af9542eb9611f77cbf58fbddf1a9c3c1ed9c293ce73635a97ae11b69e4e0d07d48a2e683edc1e583f061ca9aec24eb469106d3fb8e52f9165552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Rule \
perl-File-Find-Rule"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Number--Compare \
perl-Text--Glob"

inherit rpm
