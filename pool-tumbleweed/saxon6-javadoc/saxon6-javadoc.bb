SUMMARY = "Javadoc for saxon6"
DESCRIPTION = "Javadoc for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-javadoc-6.5.5-16.7.noarch.rpm"
RPM_HASH = "831f80826b5ea50066cfc2b84d2423a765c89bf4a4b13b0499b5a512ed5b0dcc0dafc28d6b395d98812340ff72d925e16eaccd238a8ddb47696c206a15d53d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon6-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
