SUMMARY = "Mono Addins Framework, MSBuild Support"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications. \
 \
This package contains the pkgconfig files."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-devel-1.3.3-2.16.noarch.rpm"
RPM_HASH = "b1619929ec37a2f5d478bc30dab6975043e2b4217bb9bae90ca58c1b35dbf1ee02f12606d60a196420f7ec08fb52b8c4ec1160d895bf58cee625c6693441052b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-addins-devel \
pkgconfig-mono-addins \
pkgconfig-mono-addins-gui \
pkgconfig-mono-addins-msbuild \
pkgconfig-mono-addins-setup"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-addins \
pkgconfig-mono-addins"

inherit rpm
