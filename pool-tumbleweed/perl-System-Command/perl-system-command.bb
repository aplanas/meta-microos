SUMMARY = "Object for running system commands"
DESCRIPTION = "System::Command is a class that launches external system commands and \
return an object representing them, allowing to interact with them through \
their 'STDIN', 'STDOUT' and 'STDERR' handles."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.122"

RPM_NAME = "perl-System-Command-1.122-1.1.noarch.rpm"
RPM_HASH = "013e098472856b674a03aaca1dba27139a06af0285ebb1c322924d6e98e7b6bcec729b0a0bb78f16bd10e005c8fcd21e1c91f36cf095872b0f846d84fcebc1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(System::Command) \
perl(System::Command::Reaper) \
perl-System-Command"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IPC::Run)"

inherit rpm
