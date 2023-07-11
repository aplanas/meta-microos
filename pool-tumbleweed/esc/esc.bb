SUMMARY = "Embeds files into go programs"
DESCRIPTION = "esc embeds files into go programs and provides http.FileSystem interfaces to them."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "esc-0.2.0-2.10.aarch64.rpm"
RPM_HASH = "f3cc59bdfeb8bce61ebd4fe368069cd2f884323493be2b85ff2112df2f7231b0afeff04d3ef57f050af403c283c26bda77ed0e6c2d90fd14509e734dc211a60e"

RPROVIDES:${PN} += "esc"

RDEPENDS:${PN} += ""

inherit rpm
