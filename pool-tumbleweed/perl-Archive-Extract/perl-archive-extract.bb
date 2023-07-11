SUMMARY = "Generic archive extracting mechanism"
DESCRIPTION = "Archive::Extract is a generic archive extraction mechanism. \
 \
It allows you to extract any archive file of the type .tar, .tar.gz, .gz, \
.Z, tar.bz2, .tbz, .bz2, .zip, .xz,, .txz, .tar.xz or .lzma without having \
to worry how it does so, or use different interfaces for each type by using \
either perl modules, or commandline tools on your system. \
 \
See the 'HOW IT WORKS' section further down for details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.88"

RPM_NAME = "perl-Archive-Extract-0.88-1.10.noarch.rpm"
RPM_HASH = "7b2beb73aaba05ae3281c9a5d9ec5e38bd46113637ee9f4c06c891ff82d008f61e82ab866ce2505e3278745cbdc6352a4215ed4f915a156b6b2f2bb02207847b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Extract \
perl-Archive-Extract"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IPC--Cmd \
perl-Locale--Maketext--Simple \
perl-Module--Load--Conditional \
perl-Params--Check"

inherit rpm
