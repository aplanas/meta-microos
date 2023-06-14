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

RPROVIDES:${PN} += "libACapsConvert.so \
libAdjustHSL.so \
libAging.so \
libAspectRatio.so \
libAudioDevice-pulseaudio.so \
libAudioDevice.so \
libAudioGen.so \
libBlur.so \
libCartoon.so \
libChangeHSL.so \
libCharify.so \
libCinema.so \
libColorFilter.so \
libColorReplace.so \
libColorTap.so \
libColorTransform.so \
libContrast.so \
libConvolve.so \
libDelayGrab.so \
libDenoise.so \
libDesktopCapture-pipewire.so \
libDesktopCapture-qtscreen.so \
libDesktopCapture.so \
libDice.so \
libDistort.so \
libDizzy.so \
libEdge.so \
libEmboss.so \
libEqualize.so \
libFaceDetect.so \
libFaceTrack.so \
libFalseColor.so \
libFire.so \
libFlip.so \
libFrameOverlap.so \
libGamma.so \
libGrayScale.so \
libHalftone.so \
libHypnotic.so \
libImplode.so \
libInvert.so \
libLife.so \
libMatrix.so \
libMatrixTransform.so \
libMultiSink-ffmpeg.so \
libMultiSink.so \
libMultiSrc-ffmpeg.so \
libMultiSrc-vlc.so \
libMultiSrc.so \
libMultiplex.so \
libNervous.so \
libNormalize.so \
libOilPaint.so \
libOtsu.so \
libPhotocopy.so \
libPixelate.so \
libPrimariesColors.so \
libQuark.so \
libRadioactive.so \
libRipple.so \
libScale.so \
libScanLines.so \
libScroll.so \
libShagadelic.so \
libSwapRB.so \
libSwirl.so \
libTemperature.so \
libVideoCapture-ffmpeg.so \
libVideoCapture-generic.so \
libVideoCapture-v4l2sys.so \
libVideoCapture-v4lutils.so \
libVideoCapture.so \
libVignette.so \
libVirtualCamera.so \
libWarhol.so \
libWarp.so \
libWave.so \
libavkys.so.9 \
plasmoid-webcamoid \
webcamoid"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libavcodec.so.58.134 \
libavdevice.so.58.13 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
libswscale.so.5.9 \
libv4l2.so.0 \
libvlc.so.5"

inherit rpm
