SUMMARY = "Examples for paexec"
DESCRIPTION = "A program that processes a list of tasks in parallel \
on different CPUs, computers in a network or whatever else. \
 \
This package contains examples for paexec."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "paexec-examples-1.1.4-2.9.noarch.rpm"
RPM_HASH = "2fa7bf1a28e7a3ac9d5b89f2c765529f758d35a54a38848b547a67475566a7e8594b6804fd23056136246508c62e4e1bcca4273f9a34084dd39eb341d41d5a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paexec-examples"

RDEPENDS:${PN} += "paexec"

inherit rpm
