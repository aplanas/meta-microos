SUMMARY = "Match Globbing Patterns Against Text"
DESCRIPTION = "Text::Glob implements glob(3) style matching that can be used to match \
against text, rather than fetching names from a filesystem. If you want to \
do full file globbing use the File::Glob module instead."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Text-Glob-0.11-1.24.noarch.rpm"
RPM_HASH = "43f1af31c5d370610b637cc604d99ffdc211b1318deb28f1f167b3a33c70d481072b9fcbcb412c8a0e41cd1664ab1aafa333eb7767df65fdf8f11a0b56fe7d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Glob \
perl-Text-Glob"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
