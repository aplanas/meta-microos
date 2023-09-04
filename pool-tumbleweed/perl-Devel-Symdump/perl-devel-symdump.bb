SUMMARY = "Dump Symbol Names or the Symbol Table"
DESCRIPTION = "This little package serves to access the symbol table of perl."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.18"

RPM_NAME = "perl-Devel-Symdump-2.18-1.25.noarch.rpm"
RPM_HASH = "139bada861c503691f93aae44f6b475475ae2a31c6ea616c6a3d5d734e4c1ba5851e5a9b372a26ba2f46e285dabc795f6cb1d4936b7595ace0aaeea4bbd8a622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Symdump \
perl-Devel--Symdump--Export \
perl-Devel-Symdump"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Compress--Zlib"

inherit rpm
