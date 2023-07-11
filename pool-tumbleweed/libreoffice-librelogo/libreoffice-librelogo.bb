SUMMARY = "LibreLogo scripting language"
DESCRIPTION = "Enables LibreLogo scripting in Writer. LibreLogo is a Logo-like \
programming language with interactive vectorgraphics for education and \
DTP."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-librelogo-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "efd209d36b638cc6a4fa6bf9da43ce31c7bba631bd970d678b02d4d51926bfb39e2f494f09779a4f2c6c81ca430c740381f62fac16606dd4121d58232c464fc5"

RPROVIDES:${PN} += "libreoffice-librelogo"

RDEPENDS:${PN} += "libreoffice-pyuno \
libreoffice-writer"

inherit rpm
