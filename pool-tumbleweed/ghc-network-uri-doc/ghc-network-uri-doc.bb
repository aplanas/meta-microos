SUMMARY = "Haskell network-uri library documentation"
DESCRIPTION = "This package provides the Haskell network-uri library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-doc-2.6.4.2-2.6.noarch.rpm"
RPM_HASH = "71beda96292e7bb416aaafdaa5b92409d0cbdec09a7f7c4554e509a98c7d39a1ceb1cb2ca845e836c0603d114555d60cc5fe7410dc9cb1a2db94cf2d1236ab48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-uri-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
