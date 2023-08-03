SUMMARY = "Dynamic linker configuration for the SHERPA-MC libraries"
DESCRIPTION = "Contains the ld.so.conf.d file for the SHERPA-MC libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.12"

RPM_NAME = "libSHERPA-MC0-config-2.2.12-3.3.noarch.rpm"
RPM_HASH = "a212ed1cadac697c5813c7620c2fb8360ac1ff670fba596e836630996389edcf9ac8f1431d2f73e7de7f6355eda84b9d50273fefb799a134ffa414a2a0a328c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libSHERPA-MC0-config \
libSHERPA-MC-config \
libSHERPA-MC0-config"

RDEPENDS:${PN} += ""

inherit rpm
