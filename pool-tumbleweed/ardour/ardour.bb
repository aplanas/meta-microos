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

PV = "7.4.0"

RPM_NAME = "ardour-7.4.0-1.1.aarch64.rpm"
RPM_HASH = "303fc31a8f47bd913734913a02912aafde3a8a259c8cb697f4c893cf343aa152735ffab50f5a43a4629a308debab8366ad1184262cb7d0347e75115af525e3dc"

RPROVIDES:${PN} += "application() \
application(ardour7.desktop) \
ardour \
ardour(aarch-64) \
config(ardour) \
libalsa_audiobackend.so()(64bit) \
libardour.so.3()(64bit) \
libardour_cc121.so()(64bit) \
libardour_contourdesign.so()(64bit) \
libardour_faderport.so()(64bit) \
libardour_faderport16.so()(64bit) \
libardour_faderport2.so()(64bit) \
libardour_faderport8.so()(64bit) \
libardour_generic_midi.so()(64bit) \
libardour_launch_control_xl.so()(64bit) \
libardour_mcp.so()(64bit) \
libardour_midisurface.so()(64bit) \
libardour_osc.so()(64bit) \
libardour_push2.so()(64bit) \
libardour_us2400.so()(64bit) \
libardour_websockets.so()(64bit) \
libardouralsautil.so.0()(64bit) \
libardourcp.so()(64bit) \
libardourvampplugins.so()(64bit) \
libardourvamppyin.so.0()(64bit) \
libaudiographer.so.0()(64bit) \
libcanvas.so.0()(64bit) \
libclearlooks.so()(64bit) \
libdummy_audiobackend.so()(64bit) \
libevoral.so.0()(64bit) \
libgtkmm2ext.so.0()(64bit) \
libjack_audiobackend.so()(64bit) \
libmidipp.so.4()(64bit) \
libpan1in2out.so()(64bit) \
libpan2in2out.so()(64bit) \
libpanbalance.so()(64bit) \
libpanvbap.so()(64bit) \
libpbd.so.4()(64bit) \
libptformat.so.0()(64bit) \
libpulseaudio_backend.so()(64bit) \
libtemporal.so.0()(64bit) \
libwaveview.so.0()(64bit) \
libwidgets.so.0()(64bit) \
metainfo() \
metainfo(ardour7.appdata.xml) \
mimehandler(application/x-ardour)"

RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
graphviz \
libX11.so.6()(64bit) \
libarchive.so.13()(64bit) \
libasound.so.2()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libaubio.so.5()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libcurl.so.4()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfftw3f.so.3()(64bit) \
libfftw3f_threads.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgdkmm-2.4.so.1()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgtkmm-2.4.so.1()(64bit) \
libjack.so.0()(64bit) \
liblilv-0-0 \
liblilv-0.so.0()(64bit) \
liblo.so.7()(64bit) \
liblrdf.so.2()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libreadline.so.8()(64bit) \
librubberband.so.2()(64bit) \
libsamplerate.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libsuil-0.so.0()(64bit) \
libtag.so.1()(64bit) \
libusb-1.0.so.0()(64bit) \
libvamp-hostsdk.so.3()(64bit) \
libvamp-sdk.so.2()(64bit) \
libwebsockets.so.19()(64bit) \
libxml2.so.2()(64bit) \
lv2 \
shared-mime-info"

inherit rpm
