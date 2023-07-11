SUMMARY = "Windows Subsystem for Linux distro launcher"
DESCRIPTION = "Windows application shipped within the WSL applications in the \
Windows Store. This application is initializing and launching \
the distribution."
LICENSE = "MIT"

PV = "0.0.1+git20200918.2ed9a93"

RPM_NAME = "WSL-DistroLauncher-0.0.1+git20200918.2ed9a93-1.14.noarch.rpm"
RPM_HASH = "f7dc9821c9c6b10c34acdd73b7e50dc4e9e8b12926c42f7916708ebe5eca5704c1d1e1099ad0e7aa19434a774936ad30d94e6c22ea60aca362830639d4b8cf67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WSL-DistroLauncher"

RDEPENDS:${PN} += ""

inherit rpm
