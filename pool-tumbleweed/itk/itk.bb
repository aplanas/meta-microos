SUMMARY = "Object Oriented Extension for Tcl"
DESCRIPTION = "Incr Tcl adds object-oriented programming facilities to Tcl.  It was \
NOT designed as another whiz-bang, object-oriented programming \
language. It is patterned somewhat after C++.  It was designed to \
support more structured programming in Tcl.  Scripts that grow beyond a \
few thousand lines become extremely difficult to maintain. [incr Tcl] \
attacks this problem in the same way that any object- oriented \
programming language would, by providing mechanisms for data \
encapsulation behind well-defined interfaces. \
 \
 \
 \
Authors: \
-------- \
    Michael J. McLennan <michael.mclennan@att.com> \
    Dr. John Ousterhout <john.ousterhout@eng.sun.com>"
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "itk-4.1.0-2.17.aarch64.rpm"
RPM_HASH = "7109b96a2290858eb7aaee296af6b3ca5dd38274582c9d3cafbdee0ae8cdcb9aa163edff76c5e17dad28dafbf78d32d91f27c8e4821abda2c057f75b7be023cb"

RPROVIDES:${PN} += "itcl:/usr/share/man/mann/itk.n.gz \
itk \
itk(aarch-64) \
libitk4.1.0.so()(64bit)"

RDEPENDS:${PN} += "itcl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
tcl \
tk"

inherit rpm
