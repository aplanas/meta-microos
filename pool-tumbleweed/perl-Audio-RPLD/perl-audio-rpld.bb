SUMMARY = "Module to control the RoarAudio PlayList Daemon (rpld)"
DESCRIPTION = "Audio::RPLD is a Perl module to access the RoarAudio PlayList Daemon from \
within any Perl application. \
It supports most commands supported by the rpld. \
This included commands to control playback, the Main Queue, playlists \
and pointer mangement."
LICENSE = "GPL-3.0"

PV = "0.007_0.1beta6"

RPM_NAME = "perl-Audio-RPLD-0.007_0.1beta6-1.24.noarch.rpm"
RPM_HASH = "17cc0f007f39a9b49c645a13589f6ec7830b7233bb85af74d5128d1c900b635c01e7a04ea4d6b622d608f400a93728041b8bc40781aa83ec09abc1878168b0f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Audio--RPLD \
perl-Audio-RPLD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
