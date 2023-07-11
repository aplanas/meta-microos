SUMMARY = "Debug information for package WSL-DistroLauncher"
DESCRIPTION = "This package provides debug information for package WSL-DistroLauncher. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "MIT"

PV = "0.0.1+git20200918.2ed9a93"

RPM_NAME = "WSL-DistroLauncher-debug-0.0.1+git20200918.2ed9a93-1.14.noarch.rpm"
RPM_HASH = "553770145ddb24096d53f8f6933da5a765eeedc93e05bde6ea7c2b79dab8dabf1be981ce611205a1e3b4190fcb54972941d17dc63380086cfbb62d4fd8903f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WSL-DistroLauncher-debug"

RDEPENDS:${PN} += ""

inherit rpm
