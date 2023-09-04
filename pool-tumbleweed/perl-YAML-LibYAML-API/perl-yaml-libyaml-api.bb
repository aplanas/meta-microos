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

RPM_NAME = "perl-YAML-LibYAML-API-0.013-1.10.aarch64.rpm"
RPM_HASH = "527562f2cb7243098c7bee30a45b89bb5f5e52f0861fccaafcc2e6ea697e698a98303aa80184d2b446139b79d92be55ec965e22ca25ec3155123d33d747c5569"

RPROVIDES:${PN} += "perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML-LibYAML-API"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-YAML--PP--Common"

inherit rpm
