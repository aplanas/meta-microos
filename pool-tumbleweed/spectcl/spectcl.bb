SUMMARY = "Interface Builder for Tcl/Tk and Java"
DESCRIPTION = "An interface builder for Tcl/Tk and Java. \
 \
Main Features of SpecTcl: * Easy to Learn:SpecTcl's drag & drop \
   interface along with a powerful toolbar and on-line help that \
   make it easy to start building GUI applications. \
 \
* Tcl and Java Support: SpecTcl generates both Tcl and Java code. \
   Note: this generates code for the old JDK 1.0 \
 \
* Platform Independent: SpecTcl runs on all major platforms: \
   Solaris, SunOS, Linux, Windows 95, Windows NT, MacOS, and Irix. \
 \
* Constraint Based Geometry Manager: Alignment and resizing of widgets \
(buttons, check boxes, and more.) is automatic. This makes creating \
dynamic UIs and cross platform UIs a snap! \
 \
 \
 \
Authors: \
-------- \
    Raymond Johnson <spectcl@tcl.eng.sun.com> \
    Ioi Lam \
    Allan Pratt"
LICENSE = "SUSE-Sun-Laboratories"

PV = "1.2.1.9"

RPM_NAME = "spectcl-1.2.1.9-104.16.noarch.rpm"
RPM_HASH = "2061f3483a720e5d64914a76ecad66a47703a04856af624153e5e7c79fb965f0acd76da1e5a5c975d460d9f75aa973de6c4aa2383b76904b4e5c9453747d88c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SpecTcl1.1 \
spectcl"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/wish \
tk"

inherit rpm
