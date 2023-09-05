SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "perf-rebuild-6.4.12-81.2.aarch64.rpm"
RPM_HASH = "12f0fb4feaffc6d59271499840487e4e3c60dd4982b67cb1c843fb3efed47a32780883565c45716b5ccec4bac6ac0f46d1574cf106f29b7872b59f80d415d6cd"

RPROVIDES:${PN} += "perf-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
