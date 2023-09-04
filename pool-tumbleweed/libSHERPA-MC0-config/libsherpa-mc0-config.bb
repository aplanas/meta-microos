SUMMARY = "Dynamic linker configuration for the SHERPA-MC libraries"
DESCRIPTION = "Contains the ld.so.conf.d file for the SHERPA-MC libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.12"

RPM_NAME = "libSHERPA-MC0-config-2.2.12-3.4.noarch.rpm"
RPM_HASH = "e947540eed7c1f45660557cbc50f16177367e14e079e832758dc31475f173a0a9d92e1cf9c931faab5d673fd8b9c8661761269b0f01eabcb3b6cc7822aee530d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libSHERPA-MC0-config \
libSHERPA-MC-config \
libSHERPA-MC0-config"

RDEPENDS:${PN} += ""

inherit rpm
