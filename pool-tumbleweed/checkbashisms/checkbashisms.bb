SUMMARY = "Tool for checking /bin/sh scripts for possible bashisms"
DESCRIPTION = "checkbashisms performs basic checks on /bin/sh shell scripts for \
the possible presence of bashisms. It takes the names of the shell \
scripts on the command line, and outputs warnings if possible \
bashisms are detected."
LICENSE = "GPL-2.0-or-later"

PV = "2.22.2"

RPM_NAME = "checkbashisms-2.22.2-1.6.noarch.rpm"
RPM_HASH = "0c363a8b3823eb1b2b9c4590072fa093f527cb1a39877a5f0d8fae441f8d444fe14cefc52f2c05b5e4fcb7053b8217dcfa2f9abd2d750a3ca26ef053d56d7e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checkbashisms \
deb-/usr/bin/checkbashisms \
devscripts-/usr/bin/checkbashisms"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
