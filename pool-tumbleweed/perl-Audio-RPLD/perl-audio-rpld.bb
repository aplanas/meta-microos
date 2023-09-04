SUMMARY = "Module to control the RoarAudio PlayList Daemon (rpld)"
DESCRIPTION = "Audio::RPLD is a Perl module to access the RoarAudio PlayList Daemon from \
within any Perl application. \
It supports most commands supported by the rpld. \
This included commands to control playback, the Main Queue, playlists \
and pointer mangement."
LICENSE = "GPL-3.0"

PV = "0.007_0.1beta6"

RPM_NAME = "perl-Audio-RPLD-0.007_0.1beta6-1.25.noarch.rpm"
RPM_HASH = "82cf855253e55afb1c1fb5512103af10c8fc8b666e3b4b1c53c1a6d845a833a1c6a2af34a093580f7c9b9cffa70294a8659d2ffde39fdd88c7ac15e4cad30546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Audio--RPLD \
perl-Audio-RPLD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
