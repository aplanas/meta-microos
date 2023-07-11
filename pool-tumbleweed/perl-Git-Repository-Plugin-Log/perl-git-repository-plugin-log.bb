SUMMARY = "Add a log() method to Git::Repository"
DESCRIPTION = "This module adds a new method to Git::Repository."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.314"

RPM_NAME = "perl-Git-Repository-Plugin-Log-1.314-1.14.noarch.rpm"
RPM_HASH = "2d6f8796b8cf037cf8dcc7396105ddfc1def4f4dd2bb09defac21ab47b9ae26cf1ea4b08ccec28106b3214726b1ff31d1b40e6151ea84a6ac5b97d9e284ab2aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Git--Repository--Log \
perl-Git--Repository--Log--Iterator \
perl-Git--Repository--Plugin--Log \
perl-Git-Repository-Plugin-Log"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Git--Repository \
perl-Git--Repository--Command \
perl-Git--Repository--Plugin"

inherit rpm
