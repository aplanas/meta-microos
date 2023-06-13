SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-bad-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "9a063e6e89560c3e6ba1537a1a4b4a845d4600fa4d09b26c795cbbc6d3732903c5a59351bdc6e61f9c68f8a330585eb549f468569bae148bdd500fccb0536f93"

RPROVIDES:${PN} += "gst-plugins-bad \
gstreamer-plugins-bad \
gstreamer-plugins-bad(aarch-64) \
gstreamer1(decoder-application/dash+xml)()(64bit) \
gstreamer1(decoder-application/mxf)()(64bit) \
gstreamer1(decoder-application/vnd.ms-sstr+xml)()(64bit) \
gstreamer1(decoder-application/x-hls)()(64bit) \
gstreamer1(decoder-application/x-yuv4mpeg)(y4mversion=2)()(64bit) \
gstreamer1(decoder-audio/midi)()(64bit) \
gstreamer1(decoder-audio/mpeg)(mpegversion=2)()(64bit) \
gstreamer1(decoder-audio/mpeg)(mpegversion=4)()(64bit) \
gstreamer1(decoder-audio/ms-gsm)()(64bit) \
gstreamer1(decoder-audio/riff-midi)()(64bit) \
gstreamer1(decoder-audio/x-adpcm)()(64bit) \
gstreamer1(decoder-audio/x-aiff)()(64bit) \
gstreamer1(decoder-audio/x-ay)()(64bit) \
gstreamer1(decoder-audio/x-dts)()(64bit) \
gstreamer1(decoder-audio/x-gbs)()(64bit) \
gstreamer1(decoder-audio/x-gsm)()(64bit) \
gstreamer1(decoder-audio/x-gym)()(64bit) \
gstreamer1(decoder-audio/x-hes)()(64bit) \
gstreamer1(decoder-audio/x-ircam)()(64bit) \
gstreamer1(decoder-audio/x-kss)()(64bit) \
gstreamer1(decoder-audio/x-mod)()(64bit) \
gstreamer1(decoder-audio/x-musepack)(streamversion=7)()(64bit) \
gstreamer1(decoder-audio/x-musepack)(streamversion=8)()(64bit) \
gstreamer1(decoder-audio/x-nist)()(64bit) \
gstreamer1(decoder-audio/x-nsf)()(64bit) \
gstreamer1(decoder-audio/x-paris)()(64bit) \
gstreamer1(decoder-audio/x-private1-dts)()(64bit) \
gstreamer1(decoder-audio/x-rf64)()(64bit) \
gstreamer1(decoder-audio/x-sap)()(64bit) \
gstreamer1(decoder-audio/x-sbc)()(64bit) \
gstreamer1(decoder-audio/x-sds)()(64bit) \
gstreamer1(decoder-audio/x-spc)()(64bit) \
gstreamer1(decoder-audio/x-svx)()(64bit) \
gstreamer1(decoder-audio/x-vgm)()(64bit) \
gstreamer1(decoder-audio/x-voc)()(64bit) \
gstreamer1(decoder-audio/x-w64)()(64bit) \
gstreamer1(decoder-audio/x-xi)()(64bit) \
gstreamer1(decoder-image/jp2)()(64bit) \
gstreamer1(decoder-image/png)()(64bit) \
gstreamer1(decoder-image/svg)()(64bit) \
gstreamer1(decoder-image/svg+xml)()(64bit) \
gstreamer1(decoder-image/webp)()(64bit) \
gstreamer1(decoder-image/x-exr)()(64bit) \
gstreamer1(decoder-image/x-j2c)()(64bit) \
gstreamer1(decoder-image/x-jpc)()(64bit) \
gstreamer1(decoder-image/x-jpc-striped)()(64bit) \
gstreamer1(decoder-image/x-portable-anymap)()(64bit) \
gstreamer1(decoder-image/x-portable-bitmap)()(64bit) \
gstreamer1(decoder-image/x-portable-graymap)()(64bit) \
gstreamer1(decoder-image/x-portable-pixmap)()(64bit) \
gstreamer1(decoder-video/mpeg)(mpegversion=1)(systemstream=false)()(64bit) \
gstreamer1(decoder-video/mpeg)(mpegversion=1)(systemstream=true)()(64bit) \
gstreamer1(decoder-video/mpeg)(mpegversion=2)(systemstream=false)()(64bit) \
gstreamer1(decoder-video/mpeg)(mpegversion=2)(systemstream=true)()(64bit) \
gstreamer1(decoder-video/mpeg)(mpegversion=4)(systemstream=false)()(64bit) \
gstreamer1(decoder-video/mpegts)(systemstream=true)()(64bit) \
gstreamer1(decoder-video/x-av1)()(64bit) \
gstreamer1(decoder-video/x-cdxa)()(64bit) \
gstreamer1(decoder-video/x-divx)(divxversion=4)()(64bit) \
gstreamer1(decoder-video/x-divx)(divxversion=5)()(64bit) \
gstreamer1(decoder-video/x-h263)(variant=itu)()(64bit) \
gstreamer1(decoder-video/x-h264)()(64bit) \
gstreamer1(decoder-video/x-h265)()(64bit) \
gstreamer1(decoder-video/x-ivf)()(64bit) \
gstreamer1(decoder-video/x-vmnc)(version=1)()(64bit) \
gstreamer1(decoder-video/x-vp8)()(64bit) \
gstreamer1(decoder-video/x-vp9)()(64bit) \
gstreamer1(element-a2dpsink)()(64bit) \
gstreamer1(element-accurip)()(64bit) \
gstreamer1(element-adpcmdec)()(64bit) \
gstreamer1(element-adpcmenc)()(64bit) \
gstreamer1(element-aesdec)()(64bit) \
gstreamer1(element-aesenc)()(64bit) \
gstreamer1(element-aiffmux)()(64bit) \
gstreamer1(element-aiffparse)()(64bit) \
gstreamer1(element-alphacombine)()(64bit) \
gstreamer1(element-asfmux)()(64bit) \
gstreamer1(element-asfparse)()(64bit) \
gstreamer1(element-assrender)()(64bit) \
gstreamer1(element-atscmux)()(64bit) \
gstreamer1(element-audiobuffersplit)()(64bit) \
gstreamer1(element-audiochannelmix)()(64bit) \
gstreamer1(element-audiolatency)()(64bit) \
gstreamer1(element-audiomixmatrix)()(64bit) \
gstreamer1(element-audioparse)()(64bit) \
gstreamer1(element-audiosegmentclip)()(64bit) \
gstreamer1(element-autoconvert)()(64bit) \
gstreamer1(element-autovideoconvert)()(64bit) \
gstreamer1(element-av1dec)()(64bit) \
gstreamer1(element-av1enc)()(64bit) \
gstreamer1(element-av1parse)()(64bit) \
gstreamer1(element-avdtpsink)()(64bit) \
gstreamer1(element-avdtpsrc)()(64bit) \
gstreamer1(element-avtpaafdepay)()(64bit) \
gstreamer1(element-avtpaafpay)()(64bit) \
gstreamer1(element-avtpcrfcheck)()(64bit) \
gstreamer1(element-avtpcrfsync)()(64bit) \
gstreamer1(element-avtpcvfdepay)()(64bit) \
gstreamer1(element-avtpcvfpay)()(64bit) \
gstreamer1(element-avtpsink)()(64bit) \
gstreamer1(element-avtpsrc)()(64bit) \
gstreamer1(element-avwait)()(64bit) \
gstreamer1(element-bayer2rgb)()(64bit) \
gstreamer1(element-bpmdetect)()(64bit) \
gstreamer1(element-bs2b)()(64bit) \
gstreamer1(element-bulge)()(64bit) \
gstreamer1(element-burn)()(64bit) \
gstreamer1(element-bz2dec)()(64bit) \
gstreamer1(element-bz2enc)()(64bit) \
gstreamer1(element-camerabin)()(64bit) \
gstreamer1(element-cc708overlay)()(64bit) \
gstreamer1(element-cccombiner)()(64bit) \
gstreamer1(element-ccconverter)()(64bit) \
gstreamer1(element-ccextractor)()(64bit) \
gstreamer1(element-checksumsink)()(64bit) \
gstreamer1(element-chopmydata)()(64bit) \
gstreamer1(element-chromahold)()(64bit) \
gstreamer1(element-chromium)()(64bit) \
gstreamer1(element-circle)()(64bit) \
gstreamer1(element-clockselect)()(64bit) \
gstreamer1(element-codecalphademux)()(64bit) \
gstreamer1(element-coloreffects)()(64bit) \
gstreamer1(element-combdetect)()(64bit) \
gstreamer1(element-compare)()(64bit) \
gstreamer1(element-curlfilesink)()(64bit) \
gstreamer1(element-curlftpsink)()(64bit) \
gstreamer1(element-curlhttpsink)()(64bit) \
gstreamer1(element-curlhttpsrc)()(64bit) \
gstreamer1(element-curlsftpsink)()(64bit) \
gstreamer1(element-curlsmtpsink)()(64bit) \
gstreamer1(element-dashdemux)()(64bit) \
gstreamer1(element-dashsink)()(64bit) \
gstreamer1(element-dc1394src)()(64bit) \
gstreamer1(element-debugqroverlay)()(64bit) \
gstreamer1(element-debugspy)()(64bit) \
gstreamer1(element-diffuse)()(64bit) \
gstreamer1(element-dilate)()(64bit) \
gstreamer1(element-diracparse)()(64bit) \
gstreamer1(element-dodge)()(64bit) \
gstreamer1(element-dtlsdec)()(64bit) \
gstreamer1(element-dtlsenc)()(64bit) \
gstreamer1(element-dtlssrtpdec)()(64bit) \
gstreamer1(element-dtlssrtpdemux)()(64bit) \
gstreamer1(element-dtlssrtpenc)()(64bit) \
gstreamer1(element-dtmfdetect)()(64bit) \
gstreamer1(element-dtsdec)()(64bit) \
gstreamer1(element-dvbbasebin)()(64bit) \
gstreamer1(element-dvbsrc)()(64bit) \
gstreamer1(element-dvbsubenc)()(64bit) \
gstreamer1(element-dvbsuboverlay)()(64bit) \
gstreamer1(element-dvdspu)()(64bit) \
gstreamer1(element-errorignore)()(64bit) \
gstreamer1(element-exclusion)()(64bit) \
gstreamer1(element-faceoverlay)()(64bit) \
gstreamer1(element-fakeaudiosink)()(64bit) \
gstreamer1(element-fakevideosink)()(64bit) \
gstreamer1(element-fbdevsink)()(64bit) \
gstreamer1(element-fdkaacdec)()(64bit) \
gstreamer1(element-fdkaacenc)()(64bit) \
gstreamer1(element-fieldanalysis)()(64bit) \
gstreamer1(element-fisheye)()(64bit) \
gstreamer1(element-fpsdisplaysink)()(64bit) \
gstreamer1(element-freeverb)()(64bit) \
gstreamer1(element-gaussianblur)()(64bit) \
gstreamer1(element-gdpdepay)()(64bit) \
gstreamer1(element-gdppay)()(64bit) \
gstreamer1(element-gmedec)()(64bit) \
gstreamer1(element-gsmdec)()(64bit) \
gstreamer1(element-gsmenc)()(64bit) \
gstreamer1(element-gtkwaylandsink)()(64bit) \
gstreamer1(element-h263parse)()(64bit) \
gstreamer1(element-h264parse)()(64bit) \
gstreamer1(element-h264timestamper)()(64bit) \
gstreamer1(element-h265parse)()(64bit) \
gstreamer1(element-h265timestamper)()(64bit) \
gstreamer1(element-hlsdemux)()(64bit) \
gstreamer1(element-hlssink)()(64bit) \
gstreamer1(element-hlssink2)()(64bit) \
gstreamer1(element-id3mux)()(64bit) \
gstreamer1(element-interaudiosink)()(64bit) \
gstreamer1(element-interaudiosrc)()(64bit) \
gstreamer1(element-interlace)()(64bit) \
gstreamer1(element-intersubsink)()(64bit) \
gstreamer1(element-intersubsrc)()(64bit) \
gstreamer1(element-intervideosink)()(64bit) \
gstreamer1(element-intervideosrc)()(64bit) \
gstreamer1(element-ipcpipelinesink)()(64bit) \
gstreamer1(element-ipcpipelinesrc)()(64bit) \
gstreamer1(element-ipcslavepipeline)()(64bit) \
gstreamer1(element-irtspparse)()(64bit) \
gstreamer1(element-ivfparse)()(64bit) \
gstreamer1(element-ivtc)()(64bit) \
gstreamer1(element-jifmux)()(64bit) \
gstreamer1(element-jp2kdecimator)()(64bit) \
gstreamer1(element-jpeg2000parse)()(64bit) \
gstreamer1(element-jpegparse)()(64bit) \
gstreamer1(element-kaleidoscope)()(64bit) \
gstreamer1(element-kmssink)()(64bit) \
gstreamer1(element-lcms)()(64bit) \
gstreamer1(element-ldacenc)()(64bit) \
gstreamer1(element-line21decoder)()(64bit) \
gstreamer1(element-line21encoder)()(64bit) \
gstreamer1(element-marble)()(64bit) \
gstreamer1(element-midiparse)()(64bit) \
gstreamer1(element-mirror)()(64bit) \
gstreamer1(element-mpeg2enc)()(64bit) \
gstreamer1(element-mpeg4videoparse)()(64bit) \
gstreamer1(element-mpegpsdemux)()(64bit) \
gstreamer1(element-mpegpsmux)()(64bit) \
gstreamer1(element-mpegtsmux)()(64bit) \
gstreamer1(element-mpegvideoparse)()(64bit) \
gstreamer1(element-mplex)()(64bit) \
gstreamer1(element-mssdemux)()(64bit) \
gstreamer1(element-musepackdec)()(64bit) \
gstreamer1(element-mxfdemux)()(64bit) \
gstreamer1(element-mxfmux)()(64bit) \
gstreamer1(element-neonhttpsrc)()(64bit) \
gstreamer1(element-netsim)()(64bit) \
gstreamer1(element-openalsink)()(64bit) \
gstreamer1(element-openalsrc)()(64bit) \
gstreamer1(element-openexrdec)()(64bit) \
gstreamer1(element-openjpegdec)()(64bit) \
gstreamer1(element-openjpegenc)()(64bit) \
gstreamer1(element-openmptdec)()(64bit) \
gstreamer1(element-opusparse)()(64bit) \
gstreamer1(element-pcapparse)()(64bit) \
gstreamer1(element-perspective)()(64bit) \
gstreamer1(element-pinch)()(64bit) \
gstreamer1(element-pitch)()(64bit) \
gstreamer1(element-pngparse)()(64bit) \
gstreamer1(element-pnmdec)()(64bit) \
gstreamer1(element-pnmenc)()(64bit) \
gstreamer1(element-proxysink)()(64bit) \
gstreamer1(element-proxysrc)()(64bit) \
gstreamer1(element-qroverlay)()(64bit) \
gstreamer1(element-removesilence)()(64bit) \
gstreamer1(element-rfbsrc)()(64bit) \
gstreamer1(element-rgb2bayer)()(64bit) \
gstreamer1(element-ristrtpdeext)()(64bit) \
gstreamer1(element-ristrtpext)()(64bit) \
gstreamer1(element-ristrtxreceive)()(64bit) \
gstreamer1(element-ristrtxsend)()(64bit) \
gstreamer1(element-ristsink)()(64bit) \
gstreamer1(element-ristsrc)()(64bit) \
gstreamer1(element-rotate)()(64bit) \
gstreamer1(element-roundrobin)()(64bit) \
gstreamer1(element-rsvgdec)()(64bit) \
gstreamer1(element-rsvgoverlay)()(64bit) \
gstreamer1(element-rtmp2sink)()(64bit) \
gstreamer1(element-rtmp2src)()(64bit) \
gstreamer1(element-rtpasfpay)()(64bit) \
gstreamer1(element-rtponvifparse)()(64bit) \
gstreamer1(element-rtponviftimestamp)()(64bit) \
gstreamer1(element-rtpsink)()(64bit) \
gstreamer1(element-rtpsrc)()(64bit) \
gstreamer1(element-sbcdec)()(64bit) \
gstreamer1(element-sbcenc)()(64bit) \
gstreamer1(element-scenechange)()(64bit) \
gstreamer1(element-sdpdemux)()(64bit) \
gstreamer1(element-sdpsrc)()(64bit) \
gstreamer1(element-sfdec)()(64bit) \
gstreamer1(element-shmsink)()(64bit) \
gstreamer1(element-shmsrc)()(64bit) \
gstreamer1(element-simplevideomark)()(64bit) \
gstreamer1(element-simplevideomarkdetect)()(64bit) \
gstreamer1(element-smooth)()(64bit) \
gstreamer1(element-solarize)()(64bit) \
gstreamer1(element-spacescope)()(64bit) \
gstreamer1(element-spanplc)()(64bit) \
gstreamer1(element-spectrascope)()(64bit) \
gstreamer1(element-speed)()(64bit) \
gstreamer1(element-sphere)()(64bit) \
gstreamer1(element-square)()(64bit) \
gstreamer1(element-srtclientsink)()(64bit) \
gstreamer1(element-srtclientsrc)()(64bit) \
gstreamer1(element-srtenc)()(64bit) \
gstreamer1(element-srtpdec)()(64bit) \
gstreamer1(element-srtpenc)()(64bit) \
gstreamer1(element-srtserversink)()(64bit) \
gstreamer1(element-srtserversrc)()(64bit) \
gstreamer1(element-srtsink)()(64bit) \
gstreamer1(element-srtsrc)()(64bit) \
gstreamer1(element-stretch)()(64bit) \
gstreamer1(element-switchbin)()(64bit) \
gstreamer1(element-synaescope)()(64bit) \
gstreamer1(element-teletextdec)()(64bit) \
gstreamer1(element-testsrcbin)()(64bit) \
gstreamer1(element-timecodestamper)()(64bit) \
gstreamer1(element-tonegeneratesrc)()(64bit) \
gstreamer1(element-tsdemux)()(64bit) \
gstreamer1(element-tsparse)()(64bit) \
gstreamer1(element-ttmlparse)()(64bit) \
gstreamer1(element-ttmlrender)()(64bit) \
gstreamer1(element-tunnel)()(64bit) \
gstreamer1(element-twirl)()(64bit) \
gstreamer1(element-uvch264mjpgdemux)()(64bit) \
gstreamer1(element-uvch264src)()(64bit) \
gstreamer1(element-vc1parse)()(64bit) \
gstreamer1(element-videoanalyse)()(64bit) \
gstreamer1(element-videocodectestsink)()(64bit) \
gstreamer1(element-videodiff)()(64bit) \
gstreamer1(element-videoframe-audiolevel)()(64bit) \
gstreamer1(element-videoparse)()(64bit) \
gstreamer1(element-videosegmentclip)()(64bit) \
gstreamer1(element-viewfinderbin)()(64bit) \
gstreamer1(element-vmncdec)()(64bit) \
gstreamer1(element-voamrwbenc)()(64bit) \
gstreamer1(element-vp8alphadecodebin)()(64bit) \
gstreamer1(element-vp9alphadecodebin)()(64bit) \
gstreamer1(element-vp9parse)()(64bit) \
gstreamer1(element-vulkancolorconvert)()(64bit) \
gstreamer1(element-vulkandownload)()(64bit) \
gstreamer1(element-vulkanimageidentity)()(64bit) \
gstreamer1(element-vulkanoverlaycompositor)()(64bit) \
gstreamer1(element-vulkanshaderspv)()(64bit) \
gstreamer1(element-vulkansink)()(64bit) \
gstreamer1(element-vulkanupload)()(64bit) \
gstreamer1(element-vulkanviewconvert)()(64bit) \
gstreamer1(element-watchdog)()(64bit) \
gstreamer1(element-waterripple)()(64bit) \
gstreamer1(element-wavescope)()(64bit) \
gstreamer1(element-waylandsink)()(64bit) \
gstreamer1(element-webpdec)()(64bit) \
gstreamer1(element-webpenc)()(64bit) \
gstreamer1(element-webrtcbin)()(64bit) \
gstreamer1(element-webrtcdsp)()(64bit) \
gstreamer1(element-webrtcechoprobe)()(64bit) \
gstreamer1(element-webvttenc)()(64bit) \
gstreamer1(element-wrappercamerabinsrc)()(64bit) \
gstreamer1(element-y4mdec)()(64bit) \
gstreamer1(element-zbar)()(64bit) \
gstreamer1(element-zebrastripe)()(64bit) \
gstreamer1(element-zxing)()(64bit) \
gstreamer1(encoder-application/mxf)()(64bit) \
gstreamer1(encoder-audio/AMR-WB)()(64bit) \
gstreamer1(encoder-audio/mpeg)(mpegversion=4)()(64bit) \
gstreamer1(encoder-audio/x-adpcm)()(64bit) \
gstreamer1(encoder-audio/x-aiff)()(64bit) \
gstreamer1(encoder-audio/x-gsm)()(64bit) \
gstreamer1(encoder-image/jp2)()(64bit) \
gstreamer1(encoder-image/webp)()(64bit) \
gstreamer1(encoder-image/x-j2c)()(64bit) \
gstreamer1(encoder-image/x-jpc)()(64bit) \
gstreamer1(encoder-image/x-jpc-striped)()(64bit) \
gstreamer1(encoder-image/x-portable-anymap)()(64bit) \
gstreamer1(encoder-image/x-portable-bitmap)()(64bit) \
gstreamer1(encoder-image/x-portable-graymap)()(64bit) \
gstreamer1(encoder-image/x-portable-pixmap)()(64bit) \
gstreamer1(encoder-video/mpeg)(mpegversion=1)(systemstream=false)()(64bit) \
gstreamer1(encoder-video/mpeg)(mpegversion=2)(systemstream=false)()(64bit) \
gstreamer1(encoder-video/mpeg)(mpegversion=2)(systemstream=true)()(64bit) \
gstreamer1(encoder-video/mpegts)(systemstream=true)()(64bit) \
gstreamer1(encoder-video/x-av1)()(64bit) \
gstreamer1(encoder-video/x-ms-asf)()(64bit) \
gstreamer1(urisink-rtmp)()(64bit) \
gstreamer1(urisink-rtmps)()(64bit) \
gstreamer1(urisink-rtp)()(64bit) \
gstreamer1(urisink-srt)()(64bit) \
gstreamer1(urisource-dvb)()(64bit) \
gstreamer1(urisource-http)()(64bit) \
gstreamer1(urisource-https)()(64bit) \
gstreamer1(urisource-rfb)()(64bit) \
gstreamer1(urisource-rist)()(64bit) \
gstreamer1(urisource-rtmp)()(64bit) \
gstreamer1(urisource-rtmps)()(64bit) \
gstreamer1(urisource-rtp)()(64bit) \
gstreamer1(urisource-sdp)()(64bit) \
gstreamer1(urisource-srt)()(64bit) \
gstreamer1(urisource-testbin)()(64bit) \
libgstaccurip.so()(64bit) \
libgstadpcmdec.so()(64bit) \
libgstadpcmenc.so()(64bit) \
libgstaes.so()(64bit) \
libgstaiff.so()(64bit) \
libgstaom.so()(64bit) \
libgstasfmux.so()(64bit) \
libgstassrender.so()(64bit) \
libgstaudiobuffersplit.so()(64bit) \
libgstaudiofxbad.so()(64bit) \
libgstaudiolatency.so()(64bit) \
libgstaudiomixmatrix.so()(64bit) \
libgstaudiovisualizers.so()(64bit) \
libgstautoconvert.so()(64bit) \
libgstavtp.so()(64bit) \
libgstbayer.so()(64bit) \
libgstbluez.so()(64bit) \
libgstbs2b.so()(64bit) \
libgstbz2.so()(64bit) \
libgstcamerabin.so()(64bit) \
libgstclosedcaption.so()(64bit) \
libgstcodecalpha.so()(64bit) \
libgstcodectimestamper.so()(64bit) \
libgstcoloreffects.so()(64bit) \
libgstcolormanagement.so()(64bit) \
libgstcurl.so()(64bit) \
libgstdash.so()(64bit) \
libgstdc1394.so()(64bit) \
libgstdebugutilsbad.so()(64bit) \
libgstdtls.so()(64bit) \
libgstdtsdec.so()(64bit) \
libgstdvb.so()(64bit) \
libgstdvbsubenc.so()(64bit) \
libgstdvbsuboverlay.so()(64bit) \
libgstdvdspu.so()(64bit) \
libgstfaceoverlay.so()(64bit) \
libgstfbdevsink.so()(64bit) \
libgstfdkaac.so()(64bit) \
libgstfieldanalysis.so()(64bit) \
libgstfreeverb.so()(64bit) \
libgstfrei0r.so()(64bit) \
libgstgaudieffects.so()(64bit) \
libgstgdp.so()(64bit) \
libgstgeometrictransform.so()(64bit) \
libgstgme.so()(64bit) \
libgstgsm.so()(64bit) \
libgstgtkwayland.so()(64bit) \
libgsthls.so()(64bit) \
libgstid3tag.so()(64bit) \
libgstinter.so()(64bit) \
libgstinterlace.so()(64bit) \
libgstipcpipeline.so()(64bit) \
libgstivfparse.so()(64bit) \
libgstivtc.so()(64bit) \
libgstjp2kdecimator.so()(64bit) \
libgstjpegformat.so()(64bit) \
libgstkms.so()(64bit) \
libgstladspa.so()(64bit) \
libgstldac.so()(64bit) \
libgstlegacyrawparse.so()(64bit) \
libgstlv2.so()(64bit) \
libgstmicrodns.so()(64bit) \
libgstmidi.so()(64bit) \
libgstmpeg2enc.so()(64bit) \
libgstmpegpsdemux.so()(64bit) \
libgstmpegpsmux.so()(64bit) \
libgstmpegtsdemux.so()(64bit) \
libgstmpegtsmux.so()(64bit) \
libgstmplex.so()(64bit) \
libgstmusepack.so()(64bit) \
libgstmxf.so()(64bit) \
libgstneonhttpsrc.so()(64bit) \
libgstnetsim.so()(64bit) \
libgstnvcodec.so()(64bit) \
libgstopenal.so()(64bit) \
libgstopenexr.so()(64bit) \
libgstopenjpeg.so()(64bit) \
libgstopenmpt.so()(64bit) \
libgstopusparse.so()(64bit) \
libgstpcapparse.so()(64bit) \
libgstpnm.so()(64bit) \
libgstproxy.so()(64bit) \
libgstqroverlay.so()(64bit) \
libgstremovesilence.so()(64bit) \
libgstrfbsrc.so()(64bit) \
libgstrist.so()(64bit) \
libgstrsvg.so()(64bit) \
libgstrtmp2.so()(64bit) \
libgstrtpmanagerbad.so()(64bit) \
libgstrtponvif.so()(64bit) \
libgstsbc.so()(64bit) \
libgstsdpelem.so()(64bit) \
libgstsegmentclip.so()(64bit) \
libgstshm.so()(64bit) \
libgstsmooth.so()(64bit) \
libgstsmoothstreaming.so()(64bit) \
libgstsndfile.so()(64bit) \
libgstsoundtouch.so()(64bit) \
libgstspandsp.so()(64bit) \
libgstspeed.so()(64bit) \
libgstsrt.so()(64bit) \
libgstsrtp.so()(64bit) \
libgstsubenc.so()(64bit) \
libgstswitchbin.so()(64bit) \
libgstteletext.so()(64bit) \
libgsttimecode.so()(64bit) \
libgstttmlsubs.so()(64bit) \
libgstuvch264.so()(64bit) \
libgstv4l2codecs.so()(64bit) \
libgstva.so()(64bit) \
libgstvideofiltersbad.so()(64bit) \
libgstvideoframe_audiolevel.so()(64bit) \
libgstvideoparsersbad.so()(64bit) \
libgstvideosignal.so()(64bit) \
libgstvmnc.so()(64bit) \
libgstvoamrwbenc.so()(64bit) \
libgstvulkan.so()(64bit) \
libgstwaylandsink.so()(64bit) \
libgstwebp.so()(64bit) \
libgstwebrtc.so()(64bit) \
libgstwebrtcdsp.so()(64bit) \
libgsty4mdec.so()(64bit) \
libgstzbar.so()(64bit) \
libgstzxing.so()(64bit) \
metainfo() \
metainfo(gstreamer-plugins-bad.appdata.xml) \
patched_subset"

RDEPENDS:${PN} += "glib2-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libIex-3_1.so.30()(64bit) \
libImath-3_1.so.29()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libSoundTouch.so.1()(64bit) \
libX11.so.6()(64bit) \
libZXing.so.3()(64bit) \
libaom.so.3()(64bit) \
libass.so.9()(64bit) \
libavtp.so.0()(64bit) \
libbs2b.so.0()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libdc1394.so.25()(64bit) \
libdca.so.0()(64bit) \
libdrm.so.2()(64bit) \
libfdk-aac.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgme.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsm.so.1()(64bit) \
libgstadaptivedemux-1.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbadaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstbasecamerabinsrc-1.0.so.0()(64bit) \
libgstcodecparsers-1.0.so.0()(64bit) \
libgstcodecs-1.0.so.0()(64bit) \
libgstcuda-1.0.so.0()(64bit) \
libgstfft-1.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstisoff-1.0.so.0()(64bit) \
libgstmpegts-1.0.so.0()(64bit) \
libgstnet-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstphotography-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstrtp-1.0.so.0()(64bit) \
libgstsctp-1.0.so.0()(64bit) \
libgstsdp-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgsturidownloader-1.0.so.0()(64bit) \
libgstva-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgstvulkan-1.0.so.0()(64bit) \
libgstwayland-1.0.so.0()(64bit) \
libgstwebrtc-1.0.so.0()(64bit) \
libgstwebrtcnice-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
liblcms2.so.2()(64bit) \
libldacBT_enc.so.2()(64bit) \
liblilv-0.so.0()(64bit) \
liblrdf.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmicrodns.so.1()(64bit) \
libmjpegutils-2.2.so.0()(64bit) \
libmpcdec.so.6()(64bit) \
libmpeg2encpp-2.2.so.0()(64bit) \
libmplex2-2.2.so.0()(64bit) \
libneon.so.27()(64bit) \
libopenal.so.1()(64bit) \
libopenjp2.so.7()(64bit) \
libopenmpt.so.0()(64bit) \
libopus.so.0()(64bit) \
liborc-0.4.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libqrencode.so.4()(64bit) \
librsvg-2.so.2()(64bit) \
libsbc.so.1()(64bit) \
libsbc.so.1(SBC_1.0)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libspandsp.so.3()(64bit) \
libsrt.so.1.5()(64bit) \
libsrtp2.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libusb-1.0.so.0()(64bit) \
libva.so.2()(64bit) \
libvo-amrwbenc.so.0()(64bit) \
libvulkan.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
libwebp.so.7()(64bit) \
libwebrtc_audio_processing.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit) \
libzbar.so.0()(64bit) \
libzvbi.so.0()(64bit)"

inherit rpm
