SUMMARY = "Distributed lock manager library"
DESCRIPTION = "FLoM is a free open source distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. When used \
in a shell environment, FLoM manages process synchronization in the same way \
that 'nice' manages process prioritization. Supports networking, abstract \
resources, offers a library, encryption and peer authentication. \
 \
This package contains the files required to build programs with FLoM."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "flom-devel-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "99d418f633a0b98a94ce8e37dc2adbbb2ff00497250e6416ee512e34f7349db3f238fe1023773ebee97a3004c89afb3701fc4a3f67ab885b946bfa06eea427b1"

RPROVIDES:${PN} += "flom-devel flom-devel(aarch-64)"
RDEPENDS:${PN} += "libflom0"

inherit rpm
