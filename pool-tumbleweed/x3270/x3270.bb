SUMMARY = "A Family of IBM 3270 Terminal Emulators"
DESCRIPTION = "This package contains a family of IBM 3270 mainframe terminal \
emulators: \
 \
* terminal emulators for interactive use x3270	X Window System \
   c3270  curses based \
 \
* terminal emulators for scripted use s3270    see the x3270-script \
   man page tcl3270  Tcl based \
 \
* printer emulator pr3287 \
 \
* do not miss the punch card puncher emulator x026 \
 \
x3270 is an IBM 3270 terminal emulator for the X Window System.  x3270 \
runs over a telnet connection (with or without TN3270E) and emulates \
either an IBM 3279 (color) or 3278 (monochrome).  It supports APL2 \
characters, IND$FILE file transfer, NVT mode, a pop-up keypad for \
3270-specific keys, alternative keymaps, 3287 printer sessions, and a \
scrollbar and has extensive debugging and scripting facilities. \
 \
x3270a is a script that computes the correct font sizes for \
higher-resolution displays, then runs x3270. \
(x3270 handles scaling of visual elements automatically, \
but it cannot adjust the font sizes by itself.) \
 \
b3270 is a generic back-end for 3270 emulators. \
It implements the 3270 protocol and host input/output, \
and communicates with a front end application using a simple XML-based protocol. \
 \
c3270 is the curses-based version of x3270.  It runs on any dumb \
terminal (an xterm or a console, for example), and supports (almost) \
all of the x3270 features.  c3270 scripts are compatible with x3270 \
scripts, and the subset of command line options and resource \
definitions are also compatible. \
 \
s3270 is a scripting-only version of x3270.  This program is intended \
primarily for writing 'screen-scraping' applications, for example a CGI \
back-end script that retrieves database information from a mainframe. \
 \
tcl3270 is a Tcl-based 3270 scripting engine.  It lets you write Tcl \
scripts that manipulate 3270 sessions, and is quite a bit easier to set \
up and use than s3270. \
 \
pr3287 is the printer companion for the above tools, and allows printer \
output from a 3270 session to be directed to a Unix printer queue. \
 \
x026 is a fun toy which emulates an x026 puncher."
LICENSE = "MIT"

PV = "4.2"

RPM_NAME = "x3270-4.2-2.1.aarch64.rpm"
RPM_HASH = "cba5feb90db8afce9ac511e04e578f5f7e5b45ceed77db0933b80e76ad405e40cf1d2f4f1f77f49fc18afb0e826a292262fb433f4f1657d2bfc634f99028c233"

RPROVIDES:${PN} += "config-x3270 \
x3270"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libncursesw.so.6 \
libreadline.so.8 \
libssl.so.3 \
libtcl8.6.so \
libtinfo.so.6"

inherit rpm
