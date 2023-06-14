SUMMARY = "Firefox Extension for Belgium eID Middleware"
DESCRIPTION = "Mozilla Firefox extension for using the Belgian eID (electronic identity card)."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.4"

RPM_NAME = "eid-mw-firefox-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "757085422880e0ea5ab0c0512377e4d28fbd077f30d39b03f23aaa3deca0fa41ab549dfb18dcad2d22a1313eb3860799c439f5738a48d9e10c8606790709ca5e"

RPROVIDES:${PN} += "eid-mw-firefox"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
