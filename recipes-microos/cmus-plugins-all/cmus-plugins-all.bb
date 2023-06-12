SUMMARY = "Installs all cmus plugins"
DESCRIPTION = "This package pulls in all the plugins for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugins-all-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "041c95c6c387cf9d6739f534904603cf89615ed0000136ff99c35f8bcec6f571d67814daafcc80cb572eda98e42fda932f6218f015d431961e225e4c381d6129"

RPROVIDES:${PN} += "cmus-plugins-all cmus-plugins-all(aarch-64)"
RDEPENDS:${PN} += "cmus cmus-plugin-cdio cmus-plugin-cue cmus-plugin-ffmpeg cmus-plugin-flac cmus-plugin-jack cmus-plugin-libao cmus-plugin-mikmod cmus-plugin-modplug cmus-plugin-mpc cmus-plugin-opus cmus-plugin-pulse cmus-plugin-sndio cmus-plugin-vorbis cmus-plugin-wavpack"

inherit rpm
