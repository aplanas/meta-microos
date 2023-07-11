SUMMARY = "Javadoc for sbinary"
DESCRIPTION = "Javadoc for sbinary."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "sbinary-javadoc-0.4.2-4.2.noarch.rpm"
RPM_HASH = "f7dff66bd2fb4a6880fad4299f5a4347815688dd421c1dd688368c3f4cba7e29d9fb62e10a9ec4b22b8516025b343ab5c65bb11a49517a4624b47a4c4920513e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sbinary-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
