SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-hppa-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "482f498a6730313ae5b6aee4771ab5f5ceb31b62814cf8e56133fe53702f3d15cfc01f655430c0a794e7e9679871cbf77c6c9cfc39ae05f9f8aad4e85fb164bc"

RPROVIDES:${PN} += "cross-hppa-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-hppa-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
