SUMMARY = "Use the Freedesktop.org base directory specification"
DESCRIPTION = "This module can be used to find directories and files as specified by the \
Freedesktop.org Base Directory Specification. This specifications gives a \
mechanism to locate directories for configuration, application data and \
cache data. It is suggested that desktop applications for e.g. the GNOME, \
KDE or Xfce platforms follow this layout. However, the same layout can just \
as well be used for non-GUI applications. \
 \
This module forked from File::MimeInfo. \
 \
This module follows version 0.6 of BaseDir specification."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-File-BaseDir-0.09-1.10.noarch.rpm"
RPM_HASH = "4a93e21784a93d53adba1deb09d8a7a9a4bbd50f40f7f2b4932750cc5385458195bbe0303d1230765ec55ef19f4bd6a7c5396f72373043429557c092fb3d815a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--BaseDir \
perl-File--IconTheme \
perl-File--UserDirs \
perl-File-BaseDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IPC--System--Simple"

inherit rpm
