SUMMARY = "Debug information for package WSL-DistroLauncher"
DESCRIPTION = "This package provides debug information for package WSL-DistroLauncher. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "MIT"

PV = "0.0.1+git20200918.2ed9a93"

RPM_NAME = "WSL-DistroLauncher-debug-0.0.1+git20200918.2ed9a93-1.12.noarch.rpm"
RPM_HASH = "b9e83747ee0e5bfc7a063d94c7a76089378a45be0070026083cc25c1a741c2bccf19fac155e00f6fab2cb92ac40be937c8bcdde7498e3b03021a522c709592e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WSL-DistroLauncher-debug"
RDEPENDS:${PN} += ""

inherit rpm
