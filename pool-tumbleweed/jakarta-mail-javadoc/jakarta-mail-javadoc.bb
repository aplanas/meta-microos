SUMMARY = "Javadoc for jakarta-mail"
DESCRIPTION = "This package contains javadoc for jakarta-mail."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.1.0"

RPM_NAME = "jakarta-mail-javadoc-2.1.0-1.6.noarch.rpm"
RPM_HASH = "21692c4a0c46cffb6acde599d9b72412d6379408face4f49da57405e0d540748ce339ee26ecb8ed73f3b4de24de5ce059e4f786ede27aaf98f8ff60752f75ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-mail-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
