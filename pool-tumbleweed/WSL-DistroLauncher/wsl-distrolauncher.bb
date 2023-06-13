SUMMARY = "Windows Subsystem for Linux distro launcher"
DESCRIPTION = "Windows application shipped within the WSL applications in the \
Windows Store. This application is initializing and launching \
the distribution."
LICENSE = "MIT"

PV = "0.0.1+git20200918.2ed9a93"

RPM_NAME = "WSL-DistroLauncher-0.0.1+git20200918.2ed9a93-1.12.noarch.rpm"
RPM_HASH = "d890d0a1e32133276aa34956be8facb016628d38457ded3309c8883f85fc3b0d0ff3f42ae91a72a1b54feac5c4e6c0ee726dfb5012a318e045c7ead6b416ecb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WSL-DistroLauncher"

RDEPENDS:${PN} += ""

inherit rpm
