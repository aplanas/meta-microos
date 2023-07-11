SUMMARY = "Program for streaming webcam video to HTTP"
DESCRIPTION = "MJPG-streamer takes JPGs from Linux-UVC compatible webcams, from \
local files or other input plugins and streams them as M-JPEG via \
HTTP to webbrowsers, VLC and other software. It is the successor of \
uvc-streamer, a Linux-UVC streaming application with Pan/Tilt. \
 \
This package provides a fork including support for Raspberry Pi Camera. \
 \
Enable the service by specifing the video device via \
 \
 \
 \
The number reflects /dev/videoX and listening port 808X."
LICENSE = "GPL-2.0-only"

PV = "1.0.0"

RPM_NAME = "mjpg-streamer-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "6a7e0df7b84c8403d10ce1c1a728fcf06e9b988c96b946303752d5b757d6f200bf28b8f810952fedc38c0b8588c49755f96be82bae85b0740a809a65daab3c2a"

RPROVIDES:${PN} += "mjpg-streamer"

RDEPENDS:${PN} += "/usr/bin/sh \
libSDL-1.2.so.0 \
libc.so.6 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libjpeg.so.8 \
libprotobuf-c.so.1 \
libzmq.so.5"

inherit rpm
