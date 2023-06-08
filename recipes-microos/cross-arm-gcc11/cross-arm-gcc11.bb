SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-arm-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "0c0a6ae830b9a992ec55e7ceb5098e39cc794624da1c76b89bc44c85b05bdcc05717dd9241febbdfb13c7dcff55d7e69b671b243be85a48189a39aa1ce94f5a7"

RPROVIDES:${PN} += "cross-arm-gcc11 cross-arm-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
