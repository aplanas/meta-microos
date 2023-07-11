SUMMARY = "Designate Tests Only Run by Module Authors"
DESCRIPTION = "designate tests only run by module authors"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Module-Install-AuthorTests-0.002-1.28.noarch.rpm"
RPM_HASH = "09408bef371078fd2d7aae06afd529f26351abc24dcd2290c0398358ae004ad8217a92043235e6d98f40bb841c35b530563fe5340d763faf67b03aaf814ab282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Install--AuthorTests \
perl-Module-Install-AuthorTests"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Install"

inherit rpm
