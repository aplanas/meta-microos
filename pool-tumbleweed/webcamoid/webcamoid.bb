SUMMARY = "Webcam applet for Plasma"
DESCRIPTION = "Webcam applet for Plasma. \
 \
Features: \
* Take pictures with the webcam. \
* Record videos. \
* Manages multiple webcams. \
* Play/Stop capture, this saves resources while the applet is not in use. \
* Written in C++. \
* Qt based software. \
* Custom controls for each webcam. \
* Popup applet support (you can embed Webcamoid in the panel). \
* +50 video effects available. \
* Effects with live previews. \
* Translated to many languages. \
* Stand alone installation mode (use it as a normal program). \
* Use custom network and local files as capture devices. \
* Capture from desktop."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.0"

RPM_NAME = "webcamoid-9.0.0-3.1.aarch64.rpm"
RPM_HASH = "e4741f6056b9da2bb08912cafc9c1e407c42661639c25bc3ee0fa3f549b510b8f95909ba1920f900f737b19412662c656ddba466d00a0e0285d0b3e8fe02ed36"

RPROVIDES:${PN} += "application() \
application(webcamoid.desktop) \
libACapsConvert.so()(64bit) \
libAdjustHSL.so()(64bit) \
libAging.so()(64bit) \
libAspectRatio.so()(64bit) \
libAudioDevice.so()(64bit) \
libAudioDevice_pulseaudio.so()(64bit) \
libAudioGen.so()(64bit) \
libBlur.so()(64bit) \
libCartoon.so()(64bit) \
libChangeHSL.so()(64bit) \
libCharify.so()(64bit) \
libCinema.so()(64bit) \
libColorFilter.so()(64bit) \
libColorReplace.so()(64bit) \
libColorTap.so()(64bit) \
libColorTransform.so()(64bit) \
libContrast.so()(64bit) \
libConvolve.so()(64bit) \
libDelayGrab.so()(64bit) \
libDenoise.so()(64bit) \
libDesktopCapture.so()(64bit) \
libDesktopCapture_pipewire.so()(64bit) \
libDesktopCapture_qtscreen.so()(64bit) \
libDice.so()(64bit) \
libDistort.so()(64bit) \
libDizzy.so()(64bit) \
libEdge.so()(64bit) \
libEmboss.so()(64bit) \
libEqualize.so()(64bit) \
libFaceDetect.so()(64bit) \
libFaceTrack.so()(64bit) \
libFalseColor.so()(64bit) \
libFire.so()(64bit) \
libFlip.so()(64bit) \
libFrameOverlap.so()(64bit) \
libGamma.so()(64bit) \
libGrayScale.so()(64bit) \
libHalftone.so()(64bit) \
libHypnotic.so()(64bit) \
libImplode.so()(64bit) \
libInvert.so()(64bit) \
libLife.so()(64bit) \
libMatrix.so()(64bit) \
libMatrixTransform.so()(64bit) \
libMultiSink.so()(64bit) \
libMultiSink_ffmpeg.so()(64bit) \
libMultiSrc.so()(64bit) \
libMultiSrc_ffmpeg.so()(64bit) \
libMultiSrc_vlc.so()(64bit) \
libMultiplex.so()(64bit) \
libNervous.so()(64bit) \
libNormalize.so()(64bit) \
libOilPaint.so()(64bit) \
libOtsu.so()(64bit) \
libPhotocopy.so()(64bit) \
libPixelate.so()(64bit) \
libPrimariesColors.so()(64bit) \
libQuark.so()(64bit) \
libRadioactive.so()(64bit) \
libRipple.so()(64bit) \
libScale.so()(64bit) \
libScanLines.so()(64bit) \
libScroll.so()(64bit) \
libShagadelic.so()(64bit) \
libSwapRB.so()(64bit) \
libSwirl.so()(64bit) \
libTemperature.so()(64bit) \
libVideoCapture.so()(64bit) \
libVideoCapture_ffmpeg.so()(64bit) \
libVideoCapture_generic.so()(64bit) \
libVideoCapture_v4l2sys.so()(64bit) \
libVideoCapture_v4lutils.so()(64bit) \
libVignette.so()(64bit) \
libVirtualCamera.so()(64bit) \
libWarhol.so()(64bit) \
libWarp.so()(64bit) \
libWave.so()(64bit) \
libavkys.so.9()(64bit) \
plasmoid-webcamoid \
webcamoid \
webcamoid(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavdevice.so.58.13()(64bit) \
libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
libv4l2.so.0()(64bit) \
libvlc.so.5()(64bit)"

inherit rpm
