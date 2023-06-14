SUMMARY = "Remote Desktop Viewer client library"
DESCRIPTION = "FreeRDP is a client-side implementation of the Remote Desktop Protocol (RDP) \
following the Microsoft Open Specifications. This package provides the shared \
libraries used by the client."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "libfreerdp2-2-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "00b0cd38633a600b43f91a151e7f0ba660a1ebd3236eafb1e6a80b9d079d1cffa3a246531e69db1e23c553a6f1ea48dcc4c81d3b69bf05464351452b7fb7d563"

RPROVIDES:${PN} += "libainput-client.so \
libaudin-client-alsa.so \
libaudin-client-oss.so \
libaudin-client-pulse.so \
libaudin-client.so \
libdisp-client.so \
libdrive-client.so \
libecho-client.so \
libfreerdp \
libfreerdp-client2.so.2 \
libfreerdp-server2.so.2 \
libfreerdp-shadow-subsystem2.so.2 \
libfreerdp-shadow2.so.2 \
libfreerdp2 \
libfreerdp2-2 \
libfreerdp2.so.2 \
libgeometry-client.so \
libparallel-client.so \
libprinter-client-cups.so \
libprinter-client.so \
librdp2tcp-client.so \
librdpei-client.so \
librdpgfx-client.so \
librdpsnd-client-alsa.so \
librdpsnd-client-fake.so \
librdpsnd-client-oss.so \
librdpsnd-client-proxy.so \
librdpsnd-client-pulse.so \
libserial-client.so \
liburbdrc-client-libusb.so \
liburbdrc-client.so \
libvideo-client.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXtst.so.6 \
libasound.so.2 \
libavcodec.so.60 \
libavutil.so.58 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcups.so.2 \
libgsm.so.1 \
libjpeg.so.8 \
libmp3lame.so.0 \
libpulse.so.0 \
libsoxr.so.0 \
libssl.so.3 \
libusb-1.0.so.0 \
libwinpr-tools2.so.2 \
libwinpr2.so.2 \
libxkbfile.so.1"

inherit rpm
