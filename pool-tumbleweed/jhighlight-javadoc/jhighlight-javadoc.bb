SUMMARY = "Javadocs for jhighlight"
DESCRIPTION = "This package contains the API documentation for jhighlight."
LICENSE = "CDDL-1.0 | LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "jhighlight-javadoc-1.0.1-2.10.noarch.rpm"
RPM_HASH = "21ba32aab0629e9db86e3a5695418be5e75560bc5f0293e80450785536ad90da8ef8b1bbd2f41e43c20514ebbfef4948e9efdc44b59a0cd7ccde8766a4dde6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jhighlight-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
