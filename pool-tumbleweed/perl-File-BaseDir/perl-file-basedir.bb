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

RPM_NAME = "perl-File-BaseDir-0.09-1.9.noarch.rpm"
RPM_HASH = "741ba8196fa06dc5a1828b477e7ce4830fade8b92db2b447dcfcdd85a2bf9251e18e75a323a434cde900446d5765af04d20dfdec51c6bd5da1225b0c447ab58c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::BaseDir) \
perl(File::IconTheme) \
perl(File::UserDirs) \
perl-File-BaseDir"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IPC::System::Simple)"

inherit rpm
