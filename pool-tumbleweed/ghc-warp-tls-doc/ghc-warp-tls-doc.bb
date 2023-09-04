SUMMARY = "Haskell warp-tls library documentation"
DESCRIPTION = "This package provides the Haskell warp-tls library documentation."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-doc-3.3.6-2.4.noarch.rpm"
RPM_HASH = "60c1f5f353e5cb162d1afaf7fc4710b1d396d6db86843a30d16dbb0bfd8c71832687c50517436e242d22d58c3ab74ff085537d037fc74669d80c22906f18b1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
