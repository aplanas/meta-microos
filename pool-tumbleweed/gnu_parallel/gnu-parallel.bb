SUMMARY = "Shell tool for executing jobs in parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. A job can be a single command or a small script \
that has to be run for each of the lines in the input. The typical \
input is a list of files, a list of hosts, a list of users, a list of \
URLs, or a list of tables. A job can also be a command that reads from \
a pipe. GNU Parallel can then split the input and pipe it into \
commands in parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230722"

RPM_NAME = "gnu_parallel-20230722-1.1.noarch.rpm"
RPM_HASH = "8e9d7fa360c1d25005da61331ce01ffdc43af222fced6c9c42e05258eb71af30cf936f724efc9f68a122a63ae06413ea1c74d8920a182894e28e5af25ba391b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl"

inherit rpm
