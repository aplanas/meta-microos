SUMMARY = "Tool for estimating peak virtual memory use"
DESCRIPTION = "recidivm estimates the target program's peak virtual memory use by running it multiple times with different memory limits."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "recidivm-0.2-1.13.aarch64.rpm"
RPM_HASH = "126ab99272644ae4def5e3a5bd6afeeffd25216a559a275f01ea89788f010219e9dfc4bd8bd1da34ecf34009fcaf380cede1bc6d65286b39f0bbe51445942a05"

RPROVIDES:${PN} += "recidivm \
recidivm(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
