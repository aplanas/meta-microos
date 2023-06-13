SUMMARY = "Tool for checking /bin/sh scripts for possible bashisms"
DESCRIPTION = "checkbashisms performs basic checks on /bin/sh shell scripts for \
the possible presence of bashisms. It takes the names of the shell \
scripts on the command line, and outputs warnings if possible \
bashisms are detected."
LICENSE = "GPL-2.0-or-later"

PV = "2.22.2"

RPM_NAME = "checkbashisms-2.22.2-1.3.noarch.rpm"
RPM_HASH = "05bcfececc3161a55b06a080d509aaa770016b296707f7fe3de2f311c9e64d1500e5765be2c96c49ba93d4ac19ac17ae3b8de5e1c6539fdc3cb3f393b5dc9958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checkbashisms \
deb:/usr/bin/checkbashisms \
devscripts:/usr/bin/checkbashisms"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
