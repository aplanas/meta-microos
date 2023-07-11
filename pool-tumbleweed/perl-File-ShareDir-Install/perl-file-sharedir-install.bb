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

RPM_NAME = "perl-File-ShareDir-Install-0.14-1.5.noarch.rpm"
RPM_HASH = "8215cf75a94ba5eea13dc4b99b1826b990092121e333639130bae0120d32383655a58994df1b6313a437e9dccaa9e85beae81070ec48dbdeb902a21aff96d2e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ShareDir--Install \
perl-File-ShareDir-Install"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
