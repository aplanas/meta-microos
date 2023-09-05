SUMMARY = "Windows Subsystem for Linux distro launcher"
DESCRIPTION = "Windows application shipped within the WSL applications in the \
Windows Store. This application is initializing and launching \
the distribution."
LICENSE = "MIT"

PV = "0.0.1+git20200918.2ed9a93"

RPM_NAME = "WSL-DistroLauncher-0.0.1+git20200918.2ed9a93-2.1.noarch.rpm"
RPM_HASH = "af4297dfd9a1532d5d234f0ca5e2104d9e231d81e300a2867d7039587fd12a187a252a013fb9035f711d03a3e54970a78ac0da850aad1a078bfb9f53bb165721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WSL-DistroLauncher"

RDEPENDS:${PN} += ""

inherit rpm
