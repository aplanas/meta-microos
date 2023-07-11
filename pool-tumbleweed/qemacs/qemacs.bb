SUMMARY = "An editor similar to Emacs"
DESCRIPTION = "Full screen editor with an Emacs look and feel with common Emacs features \
like multi-buffer, multi-window, command mode, universal argument, \
keyboard macros, config file with C like syntax, minibuffer with \
completion and history. Additional features: \
 \
* UTF-8 support, including bidirectional editing respecting the \
  Unicode bidi algorithm. \
 \
* WYSIWYG HTML/XML/CSS2 mode graphical editing. Supports Lynx-like \
  rendering on VT100 terminals. \
 \
* A WYSIWYG DocBook mode based on XML/CSS2 renderer. \
 \
* C mode: coloring with immediate update. Emacs like auto-indent. \
 \
* Shell mode: colorized VT100 emulation so that shells work as \
  expected. Compile mode with next/prev error. \
 \
* Input methods for most languages, including Chinese (input methods \
  come from the Yudit editor). \
 \
* Hexadecimal editing mode with insertion and block commands. Unicode \
  hexa editing of UTF-8 files also supported. \
 \
* X11 support and support for multiple proportional fonts at the same \
  time (as XEmacs). X Input methods supported. Xft extension \
  supported for anti aliased font display."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.3"

RPM_NAME = "qemacs-0.3.3-1.9.aarch64.rpm"
RPM_HASH = "d43c86cae9a779542b7dedcb0404c6409127cd9645ee4541bbcf45df74735dd30006a887c8029861794b45679cfaeec6c3df572abf0fa757c491d3362b121b0a"

RPROVIDES:${PN} += "qemacs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXv.so.1 \
libc.so.6"

inherit rpm
