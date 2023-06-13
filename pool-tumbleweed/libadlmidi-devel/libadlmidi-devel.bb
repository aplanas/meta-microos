SUMMARY = "Header files for libADLMIDI"
DESCRIPTION = "Development and header files for libADLMIDI."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.5.1"

RPM_NAME = "libadlmidi-devel-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "538755e1faa4dd82d7af655749818ada40e74ab27ef2e720c30da63dbf72e3b5b513d902e76a1174d685eac84474e4bf1f975cbfb7152154e557b4f8294ee68f"

RPROVIDES:${PN} += "libadlmidi-devel \
libadlmidi-devel(aarch-64) \
pkgconfig(libADLMIDI)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libADLMIDI1"

inherit rpm
