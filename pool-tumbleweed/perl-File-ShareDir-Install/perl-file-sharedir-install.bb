SUMMARY = "Install shared files"
DESCRIPTION = "File::ShareDir::Install allows you to install read-only data files from a \
distribution. It is a companion module to File::ShareDir, which allows you \
to locate these files after installation. \
 \
It is a port of Module::Install::Share to ExtUtils::MakeMaker with the \
improvement of only installing the files you want; '.svn', '.git' and other \
source-control junk will be ignored. \
 \
Please note that this module installs read-only data files; empty \
directories will be ignored."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-File-ShareDir-Install-0.14-1.6.noarch.rpm"
RPM_HASH = "e2197d95379e3e2d9e4c40fbc5c476f1ee6cd3125f9ce4773e1b9a3d3bc78cc2be04013bc0125a5877855d1381d3dc20515785c485fb74deca1db15401435e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ShareDir--Install \
perl-File-ShareDir-Install"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
