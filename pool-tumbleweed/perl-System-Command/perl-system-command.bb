SUMMARY = "Object for running system commands"
DESCRIPTION = "System::Command is a class that launches external system commands and \
return an object representing them, allowing to interact with them through \
their 'STDIN', 'STDOUT' and 'STDERR' handles."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.122"

RPM_NAME = "perl-System-Command-1.122-1.2.noarch.rpm"
RPM_HASH = "88b020e57f7a9f081907120cd9a8cd6d961da914969d8c1679304a01e34a96b9df9317296969887d8366b872b0726c84050da7cfaaaba98add2d47d40e0ae694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-System--Command \
perl-System--Command--Reaper \
perl-System-Command"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IPC--Run"

inherit rpm
