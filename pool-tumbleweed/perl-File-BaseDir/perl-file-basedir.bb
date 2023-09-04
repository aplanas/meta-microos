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

RPM_NAME = "perl-File-BaseDir-0.09-1.11.noarch.rpm"
RPM_HASH = "e601170756807a5a8fb3fbe06d658687a15a0e84f4635976faaf3ce89df5e34857299fc7dae9cc8ecaeffb692e99820c25c7bc31047d4f5ff3ae68b9cefdb3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--BaseDir \
perl-File--IconTheme \
perl-File--UserDirs \
perl-File-BaseDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IPC--System--Simple"

inherit rpm
