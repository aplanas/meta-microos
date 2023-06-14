SUMMARY = "A CD ripper aiming for accuracy over speed"
DESCRIPTION = "Whipper is an audio CD ripper that aims for accuracy over speed. It \
automatically tags tracks using MusicBrainz data, takes drive offsets into \
account, supports AccurateRip, and can rip certain hidden tracks. \
Whipper was forked from the Morituri project, after Morituri development halted."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "whipper-0.10.0-3.7.aarch64.rpm"
RPM_HASH = "fa10a65a248be6c2e531561bdeb7ccb5b9c0ea2c536ec7922035745eb3750204644f72083725ca662b2186613f9bcf0c6a1ba1d2ed5f524421de7816a783843c"

RPROVIDES:${PN} += "python3.10dist-whipper \
python3dist-whipper \
whipper"

RDEPENDS:${PN} += "/usr/bin/python3 \
cd-paranoia \
cdrdao \
flac \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile.so.1 \
python-abi \
python3-discid \
python3-gobject \
python3-musicbrainzngs \
python3-mutagen \
python3-pycdio \
python3-ruamel.yaml \
sox \
typelib-GLib"

inherit rpm
