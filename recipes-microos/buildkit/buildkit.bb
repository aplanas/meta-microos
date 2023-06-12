SUMMARY = "Toolkit for converting source code to build artifacts"
DESCRIPTION = "BuildKit is a toolkit for converting source code to build artifacts in an efficient, expressive and repeatable manner."
LICENSE = "Apache-2.0"

PV = "0.11.2"

RPM_NAME = "buildkit-0.11.2-1.4.aarch64.rpm"
RPM_HASH = "629f728f24138987a2ca417b61b14a62ebabcf324f42b2d27752564d5ba37bdd13a79adb76c5776ab4ac0add09309ec4302133812f4d50f36aa0181b7c044da7"

RPROVIDES:${PN} += "buildkit buildkit(aarch-64)"
RDEPENDS:${PN} += "/bin/sh containerd libc.so.6(GLIBC_2.34)(64bit) runc"

inherit rpm
