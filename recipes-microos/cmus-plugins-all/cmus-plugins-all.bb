SUMMARY = "Installs all cmus plugins"
DESCRIPTION = "This package pulls in all the plugins for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugins-all-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "0b039e928406440a2b1b135d6182681ccc043c7502999cf9c45790c2122a9b8bc6325edc853972fb40546d95f3a5c89b18301396ecac90291664c4a5bde77bf7"

RPROVIDES:${PN} += "cmus-plugins-all cmus-plugins-all(aarch-64)"
RDEPENDS:${PN} += "cmus cmus-plugin-cdio cmus-plugin-cue cmus-plugin-ffmpeg cmus-plugin-flac cmus-plugin-jack cmus-plugin-libao cmus-plugin-mikmod cmus-plugin-modplug cmus-plugin-mpc cmus-plugin-opus cmus-plugin-pulse cmus-plugin-sndio cmus-plugin-vorbis cmus-plugin-wavpack"

inherit rpm
