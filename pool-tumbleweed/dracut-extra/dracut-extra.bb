SUMMARY = "Dracut modules usually not required for normal operation"
DESCRIPTION = "This package contains all modules that are part of dracut upstream \
but are not normally supported or required."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "059+suse.375.gafb362e4"

RPM_NAME = "dracut-extra-059+suse.375.gafb362e4-1.1.aarch64.rpm"
RPM_HASH = "a2a2ee17470adf1031f52c0341cde067504cd0a381d3e542a336794eacf0959973509f3fc678d6517b5ab8f48261b072529a458563b4767fc9b927111ec78847"

RPROVIDES:${PN} += "dracut-extra"

RDEPENDS:${PN} += "/bin/bash \
dracut \
evmctl \
keyutils"

inherit rpm
