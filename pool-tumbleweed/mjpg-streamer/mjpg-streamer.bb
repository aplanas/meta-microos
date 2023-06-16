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

RPM_NAME = "mjpg-streamer-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "1bca7a530541d2b9a55ba358a20063c26e57197090a7f80c65d1bde7c566390b341c745ff1eb910ff7a537d83e1dd2373661b612c0236c4a5f269933fa2623d6"

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
