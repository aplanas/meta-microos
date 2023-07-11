SUMMARY = "Command Not Found extension for shell"
DESCRIPTION = "The 'command not found' message is not very helpful. If e.g. the unzip \
command is not found but it's available in a package, it would be very \
interesting if the system could tell that the command is currently not \
available, but installing a package would provide it."
LICENSE = "MIT"

PV = "0.2.7+20230124.b4e3468"

RPM_NAME = "scout-command-not-found-0.2.7+20230124.b4e3468-1.2.noarch.rpm"
RPM_HASH = "ccf86bab7e7f3b805b5e89e646969bc94d6836585809f22c8a9a38ecf8a8731731fe5b4c0b3e3f43835cf1be446ee694a08618fefa1dc8dafac9274ef94bbb21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "command-not-found \
config-scout-command-not-found \
scout-command-not-found"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
python3-rpm \
scout"

inherit rpm
