SUMMARY = "The Tcl Programming Language"
DESCRIPTION = "Tcl (Tool Command Language) is a very powerful but easy to learn \
dynamic programming language, suitable for a very wide range of uses, \
including web and desktop applications, networking, administration, \
testing and many more. Open source and business-friendly, Tcl is a \
mature yet evolving language that is truly cross platform, easily \
deployed and highly extensible. \
 \
For more information on Tcl see http://www.tcl.tk and \
http://wiki.tcl.tk ."
LICENSE = "TCL"

PV = "8.6.13"

RPM_NAME = "tcl-8.6.13-5.1.aarch64.rpm"
RPM_HASH = "4e166a78d11fb8a3ebaf48d1a85133b4a9fac9b7b21d01f3d9d36e8258d4d9d62a753d51a6137057926fc95be74047515b51b2e4dc99759938eafe46d32e2db3"

RPROVIDES:${PN} += "itcl \
libitcl4.2.3.so \
libtcl8.6.so \
libtdbc1.1.5.so \
libtdbcmysql1.1.5.so \
libtdbcodbc1.1.5.so \
libtdbcpostgres1.1.5.so \
libthread2.8.8.so \
rpm-macro-tcl-archdir \
rpm-macro-tcl-noarchdir \
rpm-macro-tcl-version \
rpm-macro-tclscriptdir \
tcl \
tclsh \
tclsh8.6"

RDEPENDS:${PN} += "/usr/bin/rm \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
sqlite3-tcl"

inherit rpm
