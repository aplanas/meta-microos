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

PV = "7.6.0.3"

RPM_NAME = "libreoffice-officebean-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "70a62531abd1fc6a2b4e18b4bf71c75a67acae60bdb27753b266bd78b82883edab28b78e8547962fee8574c71b7b287333bad08b85ec9ac1df400ecc1e6703b4"

RPROVIDES:${PN} += "libofficebean.so \
libreoffice-officebean"

RDEPENDS:${PN} += "jre \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjawt.so \
libreoffice \
rtld-GNU-HASH"

inherit rpm
