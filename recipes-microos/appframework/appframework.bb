SUMMARY = "Swing Application Framework"
DESCRIPTION = "The JSR-296 Swing Application Framework prototype implementation is a \
small set of Java classes that simplify building desktop applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "appframework-1.03-28.18.noarch.rpm"
RPM_HASH = "5079ce6b48ee52397a86c5648e1f46786dbaba4d363a436a8f00a54c008593b69ca11e4d63d156fd56700c1cb2d62e895386eba16294fe68d801a457a311f52b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appframework"
RDEPENDS:${PN} += "java swing-layout"

inherit rpm
