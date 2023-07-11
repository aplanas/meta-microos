SUMMARY = "A CD ripper aiming for accuracy over speed"
DESCRIPTION = "Whipper is an audio CD ripper that aims for accuracy over speed. It \
automatically tags tracks using MusicBrainz data, takes drive offsets into \
account, supports AccurateRip, and can rip certain hidden tracks. \
Whipper was forked from the Morituri project, after Morituri development halted."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "whipper-0.10.0-3.8.aarch64.rpm"
RPM_HASH = "22f263f333e083de02cd0be356cacadcd61f2d4ae2f3126d970720e49f53cce747d17e58bc515b7760ec8d3a2c05d53d79c6aafc0ffe64c26b65f1da6062855c"

RPROVIDES:${PN} += "python3.11dist-whipper \
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
