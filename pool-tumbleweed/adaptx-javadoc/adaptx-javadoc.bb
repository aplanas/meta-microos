SUMMARY = "Javadoc for adaptx"
DESCRIPTION = "This package contains the javadoc documentation for AdaptX."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-javadoc-0.9.13-136.6.noarch.rpm"
RPM_HASH = "de185658e889eaa880636da7ebc16969c9bae7eb6680f360cdb473b15b6f770e1614e4df415514556b6976ee5a1da218890f6c82f40f1bcb5506053e5aae2287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
