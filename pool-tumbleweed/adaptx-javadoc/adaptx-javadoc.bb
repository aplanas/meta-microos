SUMMARY = "Javadoc for adaptx"
DESCRIPTION = "This package contains the javadoc documentation for AdaptX."
LICENSE = "BSD-3-Clause"

PV = "0.9.13"

RPM_NAME = "adaptx-javadoc-0.9.13-136.7.noarch.rpm"
RPM_HASH = "a747ee5ab1c7b23f710157953af324c58fb3a95792635e53bfaa0b1bdbcbb4f48fd8376c591b7d7a6a072ff5edb039361dfa348f85842b837b26b76b1d4f8a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptx-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
