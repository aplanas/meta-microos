SUMMARY = "Mono Addins Framework, MSBuild Support"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications. \
 \
This package contains the pkgconfig files."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-devel-1.3.3-2.17.noarch.rpm"
RPM_HASH = "89a0c6f948a023557f668a57bb0d188b13ca0640f7824f51704cc65fdba46338960fbc58d6933869538d022ad449b3f46b08fed1b00f59c8590fa134b6bad0bc"
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
