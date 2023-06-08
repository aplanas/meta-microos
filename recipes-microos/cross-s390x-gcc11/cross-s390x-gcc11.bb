SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-s390x-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "e85961ba415f5f1cb63217e986d3095960dc2c674d988da7e731dacbefbe64c384632e1787a9d2cb85acd894f7d6a32b6fd3e074e1d0492a8fe80251ec397659"

RPROVIDES:${PN} += "cross-s390x-gcc11 cross-s390x-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-s390x-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
