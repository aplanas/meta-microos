SUMMARY = "Header files for libADLMIDI"
DESCRIPTION = "Development and header files for libADLMIDI."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.5.1"

RPM_NAME = "libadlmidi-devel-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "145e301c9b4b5694351f2ef040a72b673ffaaf9ec5e3749c2b0bce249b044c77ef6c805d6be4cde6a3a97dededa3459565bfb0addd41bf10ce5c74707e13bd10"

RPROVIDES:${PN} += "libadlmidi-devel \
pkgconfig-libADLMIDI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libADLMIDI1"

inherit rpm
