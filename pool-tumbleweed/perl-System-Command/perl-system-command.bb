SUMMARY = "Object for running system commands"
DESCRIPTION = "System::Command is a class that launches external system commands and \
return an object representing them, allowing to interact with them through \
their 'STDIN', 'STDOUT' and 'STDERR' handles."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.122"

RPM_NAME = "perl-System-Command-1.122-1.3.noarch.rpm"
RPM_HASH = "8eea24d551094bd2b0cdf7556aa26fdfa59875f48f96b2daf6ba5b76d28699e50aa1ad0ca9664603a2ada5d576d333a9ed614b73a85d2acaacdb1c22decb44dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-System--Command \
perl-System--Command--Reaper \
perl-System-Command"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IPC--Run"

inherit rpm
