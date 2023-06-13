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

RPM_NAME = "libxine-devel-1.2.13-2.2.aarch64.rpm"
RPM_HASH = "6e872823050a65718495b3934755faa2ef039de48d05b9f3ecb08b03d3293f1f5807352e80cfcbbf8cd7bdaa6ec9667623f7fb46c100ed5755edb5d80b909788"

RPROVIDES:${PN} += "libxine-devel \
libxine-devel(aarch-64) \
libxine2-devel \
pkgconfig(libxine) \
xine-devel \
xine-lib2-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
freetype2-devel \
glibc-devel \
libv4l-devel \
libxine2 \
zlib-devel"

inherit rpm
