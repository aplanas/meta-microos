SUMMARY = "A GitLab command line tool"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.31.0"

RPM_NAME = "glab-1.31.0-1.1.aarch64.rpm"
RPM_HASH = "8755ddd2fe91c117933a869c520338b62e1d7cbdfd6b50de4bf2058952c8b488c4883667ddae794dc2bea7dd9c36deea4e65d582e0bb6293bb9ce8f64d2afd87"

RPROVIDES:${PN} += "glab"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
