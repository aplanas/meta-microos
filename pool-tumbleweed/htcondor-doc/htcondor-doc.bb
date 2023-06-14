SUMMARY = "Man pages and exmamples for htcondor"
DESCRIPTION = "This package contains the man pages and addional exmples for htcondor"
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-doc-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "136249e9aeaddb2b83f7c39898283a21c9e5092311f11ebe0d8ab1897b06bcbc32abbd40619d0ac8c55d7e918ccefb356621a08bb200f7eb8c5813e74bbd364a"

RPROVIDES:${PN} += "htcondor-doc"

RDEPENDS:${PN} += ""

inherit rpm
