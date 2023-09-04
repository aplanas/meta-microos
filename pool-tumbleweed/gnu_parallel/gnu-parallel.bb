SUMMARY = "Shell tool for executing jobs in parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. A job can be a single command or a small script \
that has to be run for each of the lines in the input. The typical \
input is a list of files, a list of hosts, a list of users, a list of \
URLs, or a list of tables. A job can also be a command that reads from \
a pipe. GNU Parallel can then split the input and pipe it into \
commands in parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230822"

RPM_NAME = "gnu_parallel-20230822-1.1.noarch.rpm"
RPM_HASH = "6a525e5a746242db85097c694ebd65a763c23e614a1f869a4770a04fcc984c01b4fcdd17ea6398a7b623fff149c67136c7b5dea4cb78cfc8aeaec0342cb2d126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl"

inherit rpm
