SUMMARY = "Add a log() method to Git::Repository"
DESCRIPTION = "This module adds a new method to Git::Repository."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.314"

RPM_NAME = "perl-Git-Repository-Plugin-Log-1.314-1.15.noarch.rpm"
RPM_HASH = "2d8f114461ea737c48feda5c94fc86c78e4af736f067bd6edb0c39d1b58d0b6d23303308719328c4c16c9209068aa2e3ae030079a4a6f6bca9f073c2617f3e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Git--Repository--Log \
perl-Git--Repository--Log--Iterator \
perl-Git--Repository--Plugin--Log \
perl-Git-Repository-Plugin-Log"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Git--Repository \
perl-Git--Repository--Command \
perl-Git--Repository--Plugin"

inherit rpm
