SUMMARY = "Shell tool for executing jobs in parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. A job can be a single command or a small script \
that has to be run for each of the lines in the input. The typical \
input is a list of files, a list of hosts, a list of users, a list of \
URLs, or a list of tables. A job can also be a command that reads from \
a pipe. GNU Parallel can then split the input and pipe it into \
commands in parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230422"

RPM_NAME = "gnu_parallel-20230422-1.1.noarch.rpm"
RPM_HASH = "272a4ecb1beda0c56cdb0ca9709d3ea9da2ed474aa5f236e6185161469c934bebfa199b2b8e30edeb5cf6084697b8f7ac44736132c29cc6bb1c31a5c144f3a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl"

inherit rpm
