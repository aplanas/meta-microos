SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-s390x-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "86b325ba1fac565a56ab32f916a8c14d07f50ab3557e805a8206f47411befa5dd264516dda7dad3907ef5d6f2f8f62ff9cd522938ce9286f9e8c3ec10ab7d807"

RPROVIDES:${PN} += "cross-s390x-gcc13 cross-s390x-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-s390x-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
