SUMMARY = "Development environment for xine-based media players"
DESCRIPTION = "This package contains all necessary include files, libraries and \
configuration files needed to compile applications that use the xine \
media player. \
 \
xine is a video player which supports a large number of file formats \
(i.e., VCD, MPEG2) using plug-ins. Several plug-ins are included. \
Others can be post-installed. Supports stereo sound using OSS and AC5.1 \
using Alsa. \
 \
 \
This version of xine may lack certain features because of legal \
requirements (potential patent violation). See also \
http://en.opensuse.org/XINE#Legal_Matters \
 \
 \
More information about xine plug-ins can be found at \
http://www.xine-project.org/home \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine-devel-1.2.13-2.3.aarch64.rpm"
RPM_HASH = "7ac24ad80b27c18024db3277357a3ebb2fd6a188306e18951c477a59735f70f8066648a2a59b4284e437c7243fcff62d3238dbc2270caadf0fabbb5df09efecb"

RPROVIDES:${PN} += "libxine-devel \
libxine2-devel \
pkgconfig-libxine \
xine-devel \
xine-lib2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
freetype2-devel \
glibc-devel \
libv4l-devel \
libxine2 \
zlib-devel"

inherit rpm
