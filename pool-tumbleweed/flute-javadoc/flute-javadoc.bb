SUMMARY = "Javadoc for flute"
DESCRIPTION = "Javadoc for flute."
LICENSE = "LGPL-2.1-or-later & W3C"

PV = "1.3.0"

RPM_NAME = "flute-javadoc-1.3.0-6.6.noarch.rpm"
RPM_HASH = "1148222a2a7877758f1e42c5569a08583cc3704ca06d997fc1187ee99afb5be86f8785d2bef14cfc7c6a3967479930adeccb6a97be5f681c547095bb82f8d34e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flute-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
