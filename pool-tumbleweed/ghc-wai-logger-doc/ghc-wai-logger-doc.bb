SUMMARY = "Haskell wai-logger library documentation"
DESCRIPTION = "This package provides the Haskell wai-logger library documentation."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-doc-2.4.0-2.6.noarch.rpm"
RPM_HASH = "1b16701130368653f6207b9b86664a8cae5b31f70c92788e888348d893fd1279fc02653f09db7bc19f535e82672680ea30902687022bd98722486637a92f176a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
