SUMMARY = "A GTK+3 tool to edit subtitles"
DESCRIPTION = "Subtitle Editor is a GTK+3 tool to edit subtitles. \
It can be used for new subtitles or as a tool to transform, edit, correct \
and refine existing subtitle. This program also shows sound waves, which \
makes it easier to synchronise subtitles to voices."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "subtitleeditor-0.54.0-4.17.aarch64.rpm"
RPM_HASH = "54e631161765f875e88c2a63e885322a4ba2f1c613f7e4a8aa9a30c9e89b8cc318415fab19905ac69997f1573b52100820f8cba671c903eaea7141650aec2eca"

RPROVIDES:${PN} += "libabout.so \
libadjusttime.so \
libadobeencoredvdntsc.so \
libadobeencoredvdpal.so \
libadvancedsubstationalpha.so \
libapplytranslation.so \
libavidds.so \
libbestfit.so \
libbitc.so \
libchangeframerate.so \
libclipboard.so \
libcombinesubtitles.so \
libcommand.so \
libconfigurekeyboardshortcuts.so \
libdcsubtitle.so \
libdialoguize.so \
libdocumentmanagement.so \
libdocumentsnavigation.so \
libduplicatesubtitle.so \
libeditcell.so \
liberrorchecking.so \
libextendlength.so \
libexternalvideoplayer.so \
libfindandreplace.so \
libinsertsubtitle.so \
libinsertsubtitlefromkeyframe.so \
libitalicize.so \
libjoindocument.so \
libkeyframesmanagement.so \
libmicrodvd.so \
libminimizeduration.so \
libmoveafterprecedingsubtitle.so \
libmovesubtitles.so \
libmpl2.so \
libmpsub.so \
libplaintext.so \
libplaintextformat.so \
libpreferences.so \
libremovesubtitle.so \
libreversetextandtranslation.so \
libsami.so \
libsbv.so \
libscalesubtitles.so \
libselection.so \
libsortsubtitles.so \
libspellchecking.so \
libsplitdocument.so \
libsplitsubtitle.so \
libsprucestl.so \
libstacksubtitles.so \
libstyleeditor.so \
libstylize.so \
libsubrip.so \
libsubstationalpha.so \
libsubtitleeditorproject.so \
libsubviewer2.so \
libtemplate.so \
libtextcorrection.so \
libtimedtextauthoringformat1.so \
libtimemodemanagement.so \
libtimingfromplayer.so \
libtypewriter.so \
libvideoplayermanagement.so \
libviewmanager.so \
libwaveformmanagement.so \
subtitleeditor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstreamermm-1.0.so.1 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libm.so.6 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libsubtitleeditor.so.0 \
libxml++-2.6.so.2"

inherit rpm
