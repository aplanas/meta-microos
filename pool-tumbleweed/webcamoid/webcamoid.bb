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

PV = "9.1.1"

RPM_NAME = "webcamoid-9.1.1-1.1.aarch64.rpm"
RPM_HASH = "ff16b63c0842c13ced1ba15ab2d30ac41cd6affdcdcadbd202df2aa6a959eb0b4c1db3fc504b686a28afe8c8b3e48ad2826055a4a920ac42812dda5cc4c466fe"

RPROVIDES:${PN} += "libAdjustHSL.so \
libAging.so \
libAnalogTV.so \
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
libCrop.so \
libDelayGrab.so \
libDenoise.so \
libDesktopCapture-ffmpeg.so \
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
libImageSrc.so \
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
libNervous.so \
libNormalize.so \
libOilPaint.so \
libOpacity.so \
libOtsu.so \
libPhotocopy.so \
libPixelate.so \
libQuark.so \
libRadioactive.so \
libRipple.so \
libRotate.so \
libSaturated.so \
libScanLines.so \
libShagadelic.so \
libSwapRB.so \
libSwirl.so \
libTemperature.so \
libVideoCapture-ffmpeg.so \
libVideoCapture-qtcamera.so \
libVideoCapture-v4l2sys.so \
libVideoCapture-v4lutils.so \
libVideoCapture.so \
libVignette.so \
libVirtualCamera-akvcam.so \
libVirtualCamera-v4l2lb.so \
libVirtualCamera.so \
libWarhol.so \
libWarp.so \
libWave.so \
libZoom.so \
libavkys.so.9 \
plasmoid-webcamoid \
webcamoid"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
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
