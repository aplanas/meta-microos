SUMMARY = "Include files for development with libffi"
DESCRIPTION = "The libffi library provides a portable, high level programming \
interface to various calling conventions.  This allows a programmer to \
call any function specified by a call interface description at run \
time."
LICENSE = "MIT"

PV = "3.4.4"

RPM_NAME = "libffi-devel-3.4.4-1.4.aarch64.rpm"
RPM_HASH = "ecec01166814db4dd0c5abc7245d9c4e8d86c485f1aa3e44660c8fc0e38269a6c4aa566b5c450ed853c73264949c6f398887b7e40135e16cafaca360631cfd20"

RPROVIDES:${PN} += "libffi-devel \
pkgconfig-libffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libffi8"

inherit rpm
