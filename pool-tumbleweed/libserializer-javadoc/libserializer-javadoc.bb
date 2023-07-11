SUMMARY = "Javadoc for libserializer"
DESCRIPTION = "Javadoc for libserializer."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.6"

RPM_NAME = "libserializer-javadoc-1.1.6-1.5.noarch.rpm"
RPM_HASH = "706c2d2daa07931a65d1a69f94f2ffa56f7d4b4a6ed218f13a6043e8b56f6505dd837f04c7966bf2d4e1961bd8f5b9a750d43a291a06a57c06f46a451674432d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libserializer-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
