SUMMARY = "A GTK+3 tool to edit subtitles"
DESCRIPTION = "Subtitle Editor is a GTK+3 tool to edit subtitles. \
It can be used for new subtitles or as a tool to transform, edit, correct \
and refine existing subtitle. This program also shows sound waves, which \
makes it easier to synchronise subtitles to voices."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "subtitleeditor-0.54.0-4.16.aarch64.rpm"
RPM_HASH = "2f98a47b13e56c836b6225ef025aeb32ee16a37ff13d08dc1df3dfaab409c16a7bab5403da1b25ff91784af449fd79c2b80846caf98ec2553cbc29839f1cb307"

RPROVIDES:${PN} += "application() \
application(subtitleeditor.desktop) \
libabout.so()(64bit) \
libadjusttime.so()(64bit) \
libadobeencoredvdntsc.so()(64bit) \
libadobeencoredvdpal.so()(64bit) \
libadvancedsubstationalpha.so()(64bit) \
libapplytranslation.so()(64bit) \
libavidds.so()(64bit) \
libbestfit.so()(64bit) \
libbitc.so()(64bit) \
libchangeframerate.so()(64bit) \
libclipboard.so()(64bit) \
libcombinesubtitles.so()(64bit) \
libcommand.so()(64bit) \
libconfigurekeyboardshortcuts.so()(64bit) \
libdcsubtitle.so()(64bit) \
libdialoguize.so()(64bit) \
libdocumentmanagement.so()(64bit) \
libdocumentsnavigation.so()(64bit) \
libduplicatesubtitle.so()(64bit) \
libeditcell.so()(64bit) \
liberrorchecking.so()(64bit) \
libextendlength.so()(64bit) \
libexternalvideoplayer.so()(64bit) \
libfindandreplace.so()(64bit) \
libinsertsubtitle.so()(64bit) \
libinsertsubtitlefromkeyframe.so()(64bit) \
libitalicize.so()(64bit) \
libjoindocument.so()(64bit) \
libkeyframesmanagement.so()(64bit) \
libmicrodvd.so()(64bit) \
libminimizeduration.so()(64bit) \
libmoveafterprecedingsubtitle.so()(64bit) \
libmovesubtitles.so()(64bit) \
libmpl2.so()(64bit) \
libmpsub.so()(64bit) \
libplaintext.so()(64bit) \
libplaintextformat.so()(64bit) \
libpreferences.so()(64bit) \
libremovesubtitle.so()(64bit) \
libreversetextandtranslation.so()(64bit) \
libsami.so()(64bit) \
libsbv.so()(64bit) \
libscalesubtitles.so()(64bit) \
libselection.so()(64bit) \
libsortsubtitles.so()(64bit) \
libspellchecking.so()(64bit) \
libsplitdocument.so()(64bit) \
libsplitsubtitle.so()(64bit) \
libsprucestl.so()(64bit) \
libstacksubtitles.so()(64bit) \
libstyleeditor.so()(64bit) \
libstylize.so()(64bit) \
libsubrip.so()(64bit) \
libsubstationalpha.so()(64bit) \
libsubtitleeditorproject.so()(64bit) \
libsubviewer2.so()(64bit) \
libtemplate.so()(64bit) \
libtextcorrection.so()(64bit) \
libtimedtextauthoringformat1.so()(64bit) \
libtimemodemanagement.so()(64bit) \
libtimingfromplayer.so()(64bit) \
libtypewriter.so()(64bit) \
libvideoplayermanagement.so()(64bit) \
libviewmanager.so()(64bit) \
libwaveformmanagement.so()(64bit) \
metainfo() \
metainfo(subtitleeditor.appdata.xml) \
mimehandler(application/x-microdvd) \
mimehandler(application/x-subrip) \
mimehandler(application/x-subviewer) \
mimehandler(text/x-mpsub) \
mimehandler(text/x-ssa) \
subtitleeditor \
subtitleeditor(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstreamermm-1.0.so.1()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libm.so.6()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libsubtitleeditor.so.0()(64bit) \
libxml++-2.6.so.2()(64bit)"

inherit rpm
