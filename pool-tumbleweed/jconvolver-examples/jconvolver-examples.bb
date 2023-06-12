SUMMARY = "Configuration examples for jconvolver"
DESCRIPTION = "This package contains configuration examples for jconvolver, a convolution \
engine for JACK."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "jconvolver-examples-1.1.0-1.3.noarch.rpm"
RPM_HASH = "5a9aab47df6cf62799556b11844fe6c2ff1a7846d62eadc981dd6632392af4b3bb2242909ece67ee0142b0da46216e8fad1139f8c64022d51569b0fe09407157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jconvolver-examples"
RDEPENDS:${PN} += "jconvolver"

inherit rpm
