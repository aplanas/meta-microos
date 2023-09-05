SUMMARY = "Development headers for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-devel-3.8.1-2.1.noarch.rpm"
RPM_HASH = "10b816343aac48a2bd4b27fea52b583230a9101e2ef1519989754b15a85421b4f4f08aeee4b882be93484c1ee14bbe24c44bd971895ec726a8839b117c1dae3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-devel"

RDEPENDS:${PN} += "postfix"

inherit rpm
