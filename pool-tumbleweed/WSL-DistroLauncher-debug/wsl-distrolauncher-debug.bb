SUMMARY = "Debug information for package WSL-DistroLauncher"
DESCRIPTION = "This package provides debug information for package WSL-DistroLauncher. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "MIT"

PV = "0.0.1+git20200918.2ed9a93"

RPM_NAME = "WSL-DistroLauncher-debug-0.0.1+git20200918.2ed9a93-2.1.noarch.rpm"
RPM_HASH = "12a5c157c24f0cae0699953163e04c9b0eeba70bc932a73007d299f30cbf0b2e6a93b22009be7086f844987f3804743feb581eebd803b9df209b7f977be01a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WSL-DistroLauncher-debug"

RDEPENDS:${PN} += ""

inherit rpm
