SUMMARY = "Firefox Extension for Belgium eID Middleware"
DESCRIPTION = "Mozilla Firefox extension for using the Belgian eID (electronic identity card)."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.11"

RPM_NAME = "eid-mw-firefox-5.1.11-1.1.aarch64.rpm"
RPM_HASH = "7565b52b851a21b88b8b8da0588a22aa401f1730dfff597cdf0406eb3664a2ef674b14c4ae39af5b2d7adaa4fd0d7c5130ac8bee94adfefce291ecb1efbda0b3"

RPROVIDES:${PN} += "eid-mw-firefox"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
