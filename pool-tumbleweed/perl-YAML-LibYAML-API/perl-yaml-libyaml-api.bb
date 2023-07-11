SUMMARY = "Wrapper around the C libyaml library"
DESCRIPTION = "This module provides a thin wrapper around the C libyaml API. \
 \
Currently it provides functions for parsing and emitting events. \
 \
libyaml also provides a loader/dumper API to load/dump YAML into a list of \
nodes. There's no wrapper for these functions yet. \
 \
This is just one of the first releases. The function names will eventually \
be changed. \
 \
The sources of 'libyaml-dev' are included in this distribution. You can \
build this module with the system libyaml instead, if you remove the \
libyaml sources and call 'Makefile.PL' with 'WITH_SYSTEM_LIBYAML=1'."
LICENSE = "MIT"

PV = "0.013"

RPM_NAME = "perl-YAML-LibYAML-API-0.013-1.9.aarch64.rpm"
RPM_HASH = "40c5471769f07aed58cd77f586c161f3900d8cb5d292abd71457651e91d743c024f557d1b6c15acd028d0f727ee0463a9c8e27858232d769202730e06e5d4986"

RPROVIDES:${PN} += "perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML-LibYAML-API"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-YAML--PP--Common"

inherit rpm
