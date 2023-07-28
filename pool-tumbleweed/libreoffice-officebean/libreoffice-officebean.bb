SUMMARY = "OfficeBean Java Bean component for LibreOffice"
DESCRIPTION = "With the OfficeBean, a developer can easily write Java applications, \
harnessing the power of LibreOffice. It encapsulates a connection to \
a locally running LibreOffice process, and hides the complexity of \
establishing and maintaining that connection from the developer. \
 \
It also allows embedding of LibreOffice documents within the Java \
environment. It provides an interface the developer can use to obtain \
Java AWT windows into which the backend LibreOffice process draws \
its visual representation. These windows are then plugged into the UI \
hierarchy of the hosting Java application. The embedded document is \
controlled from the Java environment, since the OfficeBean allows \
developers to access the complete LibreOffice API from their Java \
environment giving them full control over the embedded document, its \
appearance and behavior."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-officebean-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "3589f018629b81d167f847e08ac2d93de12b3be9b1179168d0e55f70e5e74508bf1d4985e7908ca6d647f750f5afce0ce9c1cae2c6c50d5a4e491beecc8bf973"

RPROVIDES:${PN} += "libofficebean.so \
libreoffice-officebean"

RDEPENDS:${PN} += "jre-64 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjawt.so \
libreoffice \
rtld-GNU-HASH"

inherit rpm
