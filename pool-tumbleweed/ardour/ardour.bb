SUMMARY = "Multichannel Digital Audio Workstation"
DESCRIPTION = "Ardour is a multichannel hard disk recorder (HDR) and digital audio \
workstation (DAW). It is capable of simultaneous recording 24 or more \
channels of 32 bit audio at 48kHz. Ardour is intended to function as a \
'professional' HDR system, replacing dedicated hardware solutions such \
as the Mackie HDR, the Tascam 2424 and more traditional tape systems \
like the Alesis ADAT series. It is also intended to provide the same \
or better functionality as software systems such as ProTools, \
Samplitude, Logic Audio, Nuendo and Cubase VST (we acknowledge these \
and all other names as trademarks of their respective owners). It \
supports MIDI Machine Control, and so can be controlled from any MMC \
controller, such as the Mackie Digital 8 Bus mixer and many other \
modern digital mixers."
LICENSE = "GPL-3.0-only"

PV = "7.5.0"

RPM_NAME = "ardour-7.5.0-1.1.aarch64.rpm"
RPM_HASH = "ce92f1a877588e308229c9aca7a22d8a9ef22ab1345bb27cb6251af2cebd398a8bd5acd81f3070f31b9d55b80d110f009a4e383396906f027331f3da02e9dd71"

RPROVIDES:${PN} += "ardour \
config-ardour \
libalsa-audiobackend.so \
libardour-cc121.so \
libardour-console1.so \
libardour-contourdesign.so \
libardour-faderport.so \
libardour-faderport16.so \
libardour-faderport2.so \
libardour-faderport8.so \
libardour-generic-midi.so \
libardour-launch-control-xl.so \
libardour-mcp.so \
libardour-midisurface.so \
libardour-osc.so \
libardour-push2.so \
libardour-us2400.so \
libardour-websockets.so \
libardour.so.3 \
libardouralsautil.so.0 \
libardourcp.so \
libardourvampplugins.so \
libardourvamppyin.so.0 \
libaudiographer.so.0 \
libcanvas.so.0 \
libclearlooks.so \
libdummy-audiobackend.so \
libevoral.so.0 \
libgtkmm2ext.so.0 \
libjack-audiobackend.so \
libmidipp.so.4 \
libpan1in2out.so \
libpan2in2out.so \
libpanbalance.so \
libpanvbap.so \
libpbd.so.4 \
libptformat.so.0 \
libpulseaudio-backend.so \
libtemporal.so.0 \
libwaveview.so.0 \
libwidgets.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
graphviz \
libX11.so.6 \
libarchive.so.13 \
libasound.so.2 \
libatkmm-1.6.so.1 \
libaubio.so.5 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libcurl.so.4 \
libdbus-1.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgdkmm-2.4.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgtkmm-2.4.so.1 \
libjack.so.0 \
liblilv-0-0 \
liblilv-0.so.0 \
liblo.so.7 \
liblrdf.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangomm-1.4.so.1 \
libpulse.so.0 \
libreadline.so.8 \
librubberband.so.2 \
libsamplerate.so.0 \
libsigc-2.0.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libsuil-0.so.0 \
libtag.so.1 \
libusb-1.0.so.0 \
libvamp-hostsdk.so.3 \
libvamp-sdk.so.2 \
libwebsockets.so.19 \
libxml2.so.2 \
lv2 \
shared-mime-info"

inherit rpm
