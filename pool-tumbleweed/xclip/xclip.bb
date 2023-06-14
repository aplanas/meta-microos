SUMMARY = "Command Line Interface to the X11 Clipboard"
DESCRIPTION = "xclip is a command line interface to the X11 clipboard. It can also be used \
for copying files, as an alternative to sftp/scp, thus avoiding password \
prompts when X11 forwarding has already been setup."
LICENSE = "GPL-2.0-or-later"

PV = "0.13"

RPM_NAME = "xclip-0.13-2.8.aarch64.rpm"
RPM_HASH = "1ac6dcd470b4567b96c62b774fe418ba1bf2ced6b030036be75b9a8d56a5ed2ffd90a2bcc2c1812f13c2c9569615addb452cada450ee6bd9c430785633bf64a8"

RPROVIDES:${PN} += "xclip"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6"

inherit rpm
