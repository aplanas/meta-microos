SUMMARY = "Javadoc for tesla-polyglot-common"
DESCRIPTION = "This package contains javadoc for tesla-polyglot-common."
LICENSE = "EPL-1.0"

PV = "0.4.5"

RPM_NAME = "tesla-polyglot-common-javadoc-0.4.5-1.4.noarch.rpm"
RPM_HASH = "f31b204d19e9b5404f4b74c19f9ff7773df141157af6d7d82022e7908381f6f0685a54bf1afc9db38771bddf5f3757ae053fc45ca279e1f36b34f0448e36854f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesla-polyglot-common-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
