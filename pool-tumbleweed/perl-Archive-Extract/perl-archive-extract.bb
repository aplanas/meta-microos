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

RPM_NAME = "perl-Archive-Extract-0.88-1.11.noarch.rpm"
RPM_HASH = "78e3baaeabbdc9e38341b0911c89d133fa4ee3357629adab2e8c0d52b651365b020eb17ece03373e2ad06279d90eae627d0af3ed26b54ea458063b8aca99fa0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Extract \
perl-Archive-Extract"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IPC--Cmd \
perl-Locale--Maketext--Simple \
perl-Module--Load--Conditional \
perl-Params--Check"

inherit rpm
