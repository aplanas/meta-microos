SUMMARY = "TclX - Extended Tcl"
DESCRIPTION = "Extended Tcl is a superset of standard Tcl. Extended Tcl has three \
basic functional areas: A set of new commands, a Tcl shell (a Unix \
shell-style command line and interactive environment), and a \
user-extensible library of useful Tcl procedures, any of which can be \
automatically loaded on the first attempt to execute it. \
 \
In addition, a detailed help system is available for Tcl/Tk: tclhelp."
LICENSE = "BSD-3-Clause & SUSE-Permissive"

PV = "8.6.2"

RPM_NAME = "tclx-8.6.2-1.1.aarch64.rpm"
RPM_HASH = "dc1123e95c91f0f26c4d0d82e8195989b6ab38ac8a00e8d80bb332aabfcae5b496319bba7a0bebd45dc3be247d2839e9660607bca579e7d1586c1fb203a169f8"

RPROVIDES:${PN} += "libtclx8.6.so \
tclx"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
