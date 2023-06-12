SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-s390x-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "3535938b4ade85191c108885e0eab7f8055ccee857e5d44830c134cfa0f72e3115d765c428395c94b49ea625417aec523ec8318af370d89721fae9c9d1f4b896"

RPROVIDES:${PN} += "cross-s390x-gcc13 \
cross-s390x-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cross-s390x-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
